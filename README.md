# **Istruzioni dei set-up**

### 1. **Link per la connessione al reposytory tramite SSH**
git@github.com:Enrico-deFelip/MTSS2.git<br><br>

### 2. **Configurazione di git flow adottata**
Branch name for production releases: [master] main<br>
Branch name for "next release" development: [develop] dev<br>
<br>
How to name your supporting branch prefixes?<br>
Feature branches? [feature/] f/<br>
Bugfix branches? [bugfix/]<br>
Release branches? [release/] r/<br>
Hotfix branches? [hotfix/]<br>
Support branches? [support/] s/<br>
Version tag prefix? [] v<br><br>

### 3. **Settare l'abiente maven per windows**
1. **Scaricare Maven**  
    - Visitare il sito ufficiale di Apache Maven: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi).
    - Scaricare l'ultima versione binaria in formato `.zip`.

2. **Estrarre i file**  
    - Estrarre il contenuto del file `.zip` in una directory, ad esempio: `C:\Program Files\Apache\Maven`.

3. **Configurare le variabili d'ambiente**  
    - Aggiungere una nuova variabile di sistema chiamata `MAVEN_HOME` con il percorso della directory Maven, ad esempio: `C:\Program Files\Apache\Maven`.  
    - Modificare la variabile `Path` aggiungendo: `%MAVEN_HOME%\bin`.

4. **Verificare l'installazione**  
    - Aprire il terminale (Prompt dei comandi o PowerShell).  
    - Eseguire il comando: `mvn -version`.  
    - Dovrebbe apparire la versione di Maven installata e altre informazioni di configurazione.