import xml.etree.ElementTree as ET

# Percorso del file XML
filepath = ".github/badge/jacoco.xml"

# Funzione per estrarre i numeri dai nodi <counter> globali
def extract_global_counters(filepath, counter_type):
    tree = ET.parse(filepath)  # Carica e analizza l'XML
    root = tree.getroot()  # Ottieni la radice dell'XML

    # Trova il nodo <counter> globale con l'attributo type uguale a counter_type
    for counter in root.findall(f"./counter[@type='{counter_type}']"):
        missed = int(counter.get("missed"))  # Ottieni l'attributo "missed"
        covered = int(counter.get("covered"))  # Ottieni l'attributo "covered"
        return missed, covered  # Restituisci i valori come tuple

# Funzione per calcolare la percentuale
def calculate_percentage(missed, covered):
    return int((covered / (missed + covered)) * 100)

# Estrai i dati globali per "INSTRUCTION" e "BRANCH"
missed_branches, covered_branches = extract_global_counters(filepath, "BRANCH")

# Calcola le percentuali
percentuale_rami = calculate_percentage(missed_branches, covered_branches)

if percentuale_rami >= 85:
    print("Branches JaCoCo: ![Branches](https://img.shields.io/badge/Branches-" + str(percentuale_rami) +"-green)")
else:
    print("Branches JaCoCo: ![Branches](https://img.shields.io/badge/Branches-" + str(percentuale_rami) + "-red)")
