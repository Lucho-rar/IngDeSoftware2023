import sys
import os
import json
import pandas as pd
from pandas_profiling import ProfileReport

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

    count_critical = vulnerabilities[vulnerabilities['vulnerabilities.severity'].isin(['HIGH', 'CRITICAL'])].shape[0]

    if count_critical > 5:  # Suponiendo que 5 es el límite permitido
        if allow_failure:
            print_color("Este repositorio supera las vulnerabilidades críticas permitidas, no podrá desplegar en PRODUCCIÓN 🔥.", RED)
            exitCode = 1

    # Ahora puedes trabajar con 'vulnerabilities' DataFrame para generar informes, visualizaciones, etc.
    print("Vulnerabilidades Críticas:", count_critical)
    print("*******************************************")
    print("Roxs-security-tools")
    print("Reporte de Vulnerabilidades 🐛: ")
    print("*******************************************")

    # Generar un informe interactivo HTML
    profile = ProfileReport(vulnerabilities, title='Informe de Vulnerabilidades')
    profile.to_file("informe_vulnerabilidades.html")

sys.exit(exitCode)
