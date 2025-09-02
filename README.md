# Final Project QA Engineer Automation at Jayjay School
### Automation testing WEB:  https://www.demoblaze.com/ 
### Automation testing API: https://dummyapi.io/

### :zap: Teknologi yang digunakan:
- Bahasa Pemrogramman Java
- Aplikasi IntelliJ IDEA Community
- Selenium (Untuk otomatisasi browser)
- JUnit (Untuk menjalankan test)
- Rest Assured (Library java)
- Gherkin dan Framework Cucumber (Untuk menjalankan test dan report test)
- Git & Github
<img src="https://skillicons.dev/icons?i=java,idea,selenium,gradle,gherkin,git,github"/>

---

### :zap: Step Installasi Project
1. Clone Repository git clone https://github.com/fachrialviansyah/Final-Project-QA-Engineer.git
2. Install Dependensi jalankan perintah: **./gradlew build**
3. Running Test, jalankan perintah: **./gradlew test**
4. Melakukan test yang hanya 1 di pilih: **./gradlew test -Dcucumber.options="--tags @regression"**
5. View report WEB dengan format html: **report/web/report-web.html**
6. View report API dengan format html: **report/api/report-api.html**

### :zap: Struktur Final Project
    │── src 
    │   └── test
    │       ├── java
    │       │   ├── helper                                               # File Pendukung Lainnya
    │       │   │   ├── JSONSchemadata
    │       │   │   │   └── profile_user.json                        
    │       │   │   ├── Endpoint.java
    │       │   │   ├── Models.java
    │       │   │   └── Utility.java
    │       │   ├── pages                                               # Page Object Models (POM)
    │       │   │   ├── api
    │       │   │   │   └── ApiPage.java                        
    │       │   │   └── web
    │       │   │   │   ├── AboutUs.java                        
    │       │   │   │   ├── Cart.java                        
    │       │   │   │   ├── Contact.java                        
    │       │   │   │   ├── HomePage.java                        
    │       │   │   │   ├── Login.java                        
    │       │   │   │   └── Register.java                        
    │       │   ├── stepdef                                               # Step Definitions
    │       │   │   ├── api
    │       │   │   │   └── ApiStep.java                        
    │       │   │   ├── web
    │       │   │   │   └── WebStep.java                        
    │       │   │   └── Hooks.java
    │       │   ├── steprun                                               # Step Running Test
    │       │   │   ├── APITestRun
    │       │   │   │   └── ApiTest.java                        
    │       │   │   └── WebTestRun
    │       │   │   │   └── WebTest.java                        
    │       └── resources
    │           └── api.feature                                         # Feature Files API  (BDD)
    │           └── web.feature                                         # Feature Files WEB  (BDD)
    ├── .gitignore                                                      # File untuk mengecualikan file tertentu dari git
    ├── build.gradle                                                    # File konfigurasi Gradle
    ├── gradlew                                                         # Wrapper untuk Gradle (Linux/Mac)
    ├── gradlew.bat                                                     # Wrapper untuk Gradle (Windows)
    ├── config.properties                                               # File konfigurasi proyek
    └── README.md                                                       # Dokumentasi proyek


### :zap: Hasil Report API Test With Cucumber
<img width="1197" height="291" alt="image" src="https://github.com/user-attachments/assets/6ba413ca-969b-427c-8de4-ada1db659723" />

### :zap: Hasil Report WEB Test With Cucumber
<img width="1211" height="296" alt="image" src="https://github.com/user-attachments/assets/2ed3e9fc-6e34-424b-b23e-5880f6ea942c" />

### :zap: Github Actions API

### :zap: Github Actions WEB
    
### :zap: Hasil Report API Test With Github Action
- HTML Report :arrow_right: [HTML](url)
- JSON Report :arrow_right: [JSON](url)

### :zap: Hasil Report WEB Test With Github Action
- HTML Report :arrow_right: [HTML](url)
- JSON Report :arrow_right: [JSON](url)


