
"""  By Rossana Suarez
     Roxs Security-tools
     python security-tools horusec.json horusec
  """

import sys
import os
import json

RED = '\033[91m'
RESET = '\033[0m'

def print_color(message, color):
    sys.stdout.write(color + message  + '\n')
    sys.stdout.flush()

def severity(severity):
    severity = severity.upper()
    if (severity == 'ERROR'):
        return 'HIGH'
    if (severity == 'WARNING' or severity == 'UNKNOWN' or severity == 'MODERATE'):
        return "MEDIUM"
    if (severity == 'INFO'):
        return 'LOW'    
    return severity

exitCode = 0
vulnerabilities = []
fileInput = sys.argv[1]
tool = sys.argv[2]

if (os.path.isfile(fileInput)):
        allow_failure = True
with open(fileInput, 'r') as f:
        issues_dict = json.load(f)

if tool == 'horusec':
        try:
            if issues_dict['analysisVulnerabilities'] is not None:
                for issue in issues_dict['analysisVulnerabilities']:
                    issue['vulnerabilities']["severity"] = severity(issue['vulnerabilities']["severity"])
                    vulnerabilities.append(issue)
        except Exception:
            print("Incorrect horusec file format")                
else:
    print("File input does not exist")

count_bypassed = 0
count_critical = 0
allowed_critical = 5

if (len(vulnerabilities) > 0):
    for issue in vulnerabilities:
            if (issue['vulnerabilities']['severity'] == 'HIGH' or issue['vulnerabilities']['severity'] == 'CRITICAL'):
                count_critical += 1
    
    print("*******************************************")
    print("Roxs-security-tools")
    print("Reporte de Vulnerabilidades 🐛: ")
    print("Vulnerabilidades Críticas:", count_critical)
    print("*******************************************")

if count_critical > allowed_critical:
    if allow_failure:
        print_color("Este repositorio supera las vulnerabilidades criticas permitidas, no podrá desplegar en PRODUCCIÓN 🔥.", RED)
        #exitCode = 1

sys.exit(exitCode)