import sys
import os
import json
import pandas as pd
import plotly.express as px
from pydantic import BaseModel, Field, PrivateAttr

RED = '\033[91m'
RESET = '\033[0m'

def print_color(message, color):
    sys.stdout.write(color + message + '\n')
    sys.stdout.flush()

def severity(severity):
    severity = severity.upper()
    if severity == 'ERROR':
        return 'HIGH'
    if severity == 'WARNING' or severity == 'UNKNOWN' or severity == 'MODERATE':
        return "MEDIUM"
    if severity == 'INFO':
        return 'LOW'
    return severity

exitCode = 0
vulnerabilities = []
fileInput = sys.argv[1]
tool = sys.argv[2]

if os.path.isfile(fileInput):
    allow_failure = True
    with open(fileInput, 'r') as f:
        issues_dict = json.load(f)

    if tool == 'horusec':
        try:
            if issues_dict['analysisVulnerabilities'] is not None:
                vulnerabilities = pd.json_normalize(issues_dict["analysisVulnerabilities"])
                vulnerabilities['vulnerabilities.severity'] = vulnerabilities['vulnerabilities.severity'].apply(severity)
        except Exception:
            print("Incorrect horusec file format")
    else:
        print("File input does not exist")

    #count_critical = vulnerabilities[vulnerabilities['vulnerabilities.severity'].isin(['HIGH', 'CRITICAL'])].shape[0]
    count_critical = vulnerabilities[vulnerabilities['vulnerabilities.severity'] == 'CRITICAL'].shape[0]
    count_high = vulnerabilities[vulnerabilities['vulnerabilities.severity'] == 'HIGH'].shape[0]
    count_medium = vulnerabilities[vulnerabilities['vulnerabilities.severity'] == 'MEDIUM'].shape[0]
    count_low = vulnerabilities [vulnerabilities['vulnerabilities.severity'] == 'LOW'].shape[0]

    if count_critical > 3 or count_high > 5 or count_medium or 10:
        if allow_failure:
            print_color("Este repositorio supera las vulnerabilidades críticas permitidas, no podrá desplegar en PRODUCCIÓN 🔥.", RED)
            #exitCode = 1

    total_vulnerabilities = vulnerabilities.shape[0]
    
    # Calcular porcentajes
    percentage_critical = (count_critical / total_vulnerabilities) * 100
    percentage_high = (vulnerabilities[vulnerabilities['vulnerabilities.severity'] == 'HIGH'].shape[0] / total_vulnerabilities) * 100
    percentage_medium = (vulnerabilities[vulnerabilities['vulnerabilities.severity'] == 'MEDIUM'].shape[0] / total_vulnerabilities) * 100
    percentage_low = (vulnerabilities[vulnerabilities['vulnerabilities.severity'] == 'LOW'].shape[0] / total_vulnerabilities) * 100

    # Calcular porcentaje de lenguajes
    language_percentage = vulnerabilities['vulnerabilities.language'].value_counts(normalize=True) * 100

    print("Vulnerabilidades Críticas:", count_critical)
    print("Vulnerabilidades High: ",count_high)
    print("Vulnerabilidades Medium: ",count_medium)
    print("Vulnerabilidades Low: ",count_low)
    print("*******************************************")
    print("Roxs-security-tools")
    print("Reporte de Vulnerabilidades 🐛: ")
    print("*******************************************")

    print("Porcentaje de Vulnerabilidades Críticas: {:.2f}%".format(percentage_critical))
    print("Porcentaje de Vulnerabilidades High: {:.2f}%".format(percentage_high))
    print("Porcentaje de Vulnerabilidades Medium: {:.2f}%".format(percentage_medium))
    print("Porcentaje de Vulnerabilidades Low: {:.2f}%".format(percentage_low))

    print("\nPorcentaje de Lenguajes:")
    for language, percentage in language_percentage.items():
        print("{:20s}: {:.2f}%".format(language, percentage))

    
    fig = px.bar(x=language_percentage.index, y=language_percentage.values, labels={'x': 'Lenguaje', 'y': 'Porcentaje'})
    fig.update_layout(title_text='Porcentaje de Lenguajes en Vulnerabilidades', title_x=0.5)


    #fig1 = px.bar(x=percentage_critical.index, y=percentage_critical.values, labels={'x': 'Vuln. Criticas', 'y': 'Porcentaje'})
    #fig1.update_layout(title_text='Porcentaje de Lenguajes en Vulnerabilidades', title_x=0.5)
    fig1 = px.bar(x=['Critico', 'High', 'Medium', 'Low'],
                  y=[percentage_critical, percentage_high, percentage_medium, percentage_low],
                  labels={'x': 'Tipo de severidad', 'y':'Porcentaje'},
                  title= 'Porcentaje de vulnerabilidades por severidades'
                  )
    fig1.update_layout(title_x = 0.5)
    informe_texto = """
    <h2> Informe de vulnerabilidades <h2>
    """



    # Guardar el gráfico como un archivo HTML
    fig1.write_html("informe_interactivo.html", full_html=False)
    with open("informe_interactivo.html", "a") as file:
        file.write(informe_texto)
sys.exit(exitCode)
