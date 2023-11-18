import pandas as pd
import json
import plotly.express as px

# Cargar los resultados desde el archivo JSON generado por Horusec
with open('resultados_horusec.json', 'r') as f:
    resultados = json.load(f)

# Convertir los resultados en un DataFrame de pandas
df = pd.DataFrame(resultados)

# Crear un gráfico interactivo de barras con Plotly Express
fig = px.bar(df, x='Vulnerability', title='Vulnerabilidades Detectadas')

# Guardar el gráfico como un archivo HTML
fig.write_html('informe_interactivo.html')

