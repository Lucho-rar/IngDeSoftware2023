# Gestión de Calidad de Software / Ingenieria del Software
## _Trabajo Final 2023_ 

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)


En este repositorio se realizaron los proyectos de trabajo final de la materia Ingenieria del software y de Gestión de Calidad del Software. Este readme lleva profundidad hacia este último.
En un resumen sobre GCS, se trabajó sobre el Pipeline CI/CD utilizando GitHub Actions. Se agregaron al pipe:
- Steps de Maven LifeCycle 🍃
- Tools de SAST (SonarQube, Semgrep, Horusec) ⚠️
- Administración de secretos con HCP Vault 🔐
- Steps característicos de ciertos ambientes.  🌱

## Consigna

> Métricas de Calidad
Utilice una herramienta como SonarQube para determinar Líneas de Código, Bugs, Code Smells, Coverage, Duplications, Vulnerabilidades, Complejidad Ciclomática, Complejidad Cognitiva, etc.
Elabore un plan estimado para resolver y subsanar éstos issues y mejorar éstas métricas.

> SAST - Static Application Security Testing
Modifique el pipeline, agregando los pasos necesarios para hacer chequeos de SAST para identificar vulnerabilidades, por ejemplo secretos hardcodeados; empleando para ella la herramienta Horusec( horusec.io ). Falle el Pipeline para casos donde superen los umbrales de 3 Critical, 5 High y 10 Medium.

> Secrets
Configure los steps y los artefactos necesarios para almacenar los secretos del proyecto en una bóveda para cada ambiente de desarrollo. Establezca en el plan de Disaster Recovery, el proceso de rotación de secretos, en caso de detectar alguna filtración. Para ello emplee el servicio Vault( vaultproject.io ) e intégrelo de manera agnóstica al ambiente


## Plugins & Tools



| Plugin | Link |
| ------ | ------ |
| SonarQube | https://sonarqube.com/ |
| Horusec | https://horusec.io/ |
| Semgrep | https://semgrep.dev/ |
| Maven | https://maven.apache.org/ |


## Resume in images
#### PipeLine Final

![Pipe Final](/imagesXReadme/pipe-final.png)

#### Deploy Page

![Deploy Page](/imagesXReadme/deploy-page.png)

#### Cluster desplegados en HCP Vault
![Clusters](/imagesXReadme/dual-cluster.png)

#### Semgrep OUTPUT
![Semgrep](/imagesXReadme/semgrep.png)

#### Horusec & Python OUTPUT
![Horusec](/imagesXReadme/horusec.png)

#### SQube
![sq](/imagesXReadme/sq.png)
