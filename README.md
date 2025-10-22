# Final Project QA Engineer Automation at Jayjay School
### Automation testing WEB:  https://www.demoblaze.com/ 
### Automation testing API: https://dummyapi.io/

### 🧰 Teknologi yang digunakan:
- Bahasa Pemrogramman Java
- Aplikasi IntelliJ IDEA Community
- Selenium (Untuk otomatisasi browser)
- JUnit (Untuk menjalankan test)
- Rest Assured (Library java)
- Gherkin dan Framework Cucumber (Untuk menjalankan test dan report test)
- Git & Github
<img src="https://skillicons.dev/icons?i=java,idea,selenium,gradle,gherkin,git,github"/>

---

### 📌 Step Installasi Project
1. Clone Repository git clone https://github.com/fachrialviansyah/FinalProjectQA.git
2. Install Dependensi jalankan perintah: **./gradlew build**
3. Running Test, jalankan perintah: **./gradlew test**
4. Melakukan test yang hanya 1 di pilih: **./gradlew test -Dcucumber.options="--tags @regression"**
5. View report WEB dengan format html: **report/web/report-web.html**
6. View report API dengan format html: **report/api/report-api.html**

### 📁 Struktur Final Project
    │── src 
    │   └── test
    │       ├── java
    │       │   ├── helper                                               # File Pendukung Lainnya
    │       │   │   ├── JSONSchemadata
    │       │   │   │   └── profile_user.json                        
    │       │   │   ├── Endpoint.java
    │       │   │   ├── Models.java
    │       │   │   └── Utility.java
    │       │   ├── pages                                                # Page Object Models (POM)
    │       │   │   ├── api
    │       │   │   │   └── ApiPage.java                        
    │       │   │   └── web
    │       │   │   │   ├── AboutUs.java                        
    │       │   │   │   ├── Cart.java                        
    │       │   │   │   ├── Contact.java                        
    │       │   │   │   ├── HomePage.java                        
    │       │   │   │   ├── Login.java                        
    │       │   │   │   └── Register.java                        
    │       │   ├── stepdef                                               # Step Definitions API & WEB
    │       │   │   ├── api
    │       │   │   │   └── ApiStep.java                        
    │       │   │   ├── web
    │       │   │   │   └── WebStep.java                        
    │       │   │   └── Hooks.java
    │       │   ├── steprun                                               # Step Running API & WEB Test
    │       │   │   ├── APITestRun
    │       │   │   │   └── ApiTest.java                        
    │       │   │   └── WebTestRun
    │       │   │   │   └── WebTest.java                        
    │       └── resources
    │           └── api.feature                                         # Feature Files API (Behavior-Driven Development - BDD)
    │           └── web.feature                                         # Feature Files WEB (Behavior-Driven Development - BDD)
    ├── .gitignore                                                      # File untuk mengecualikan file tertentu dari git
    ├── build.gradle                                                    # File konfigurasi Gradle
    ├── gradlew                                                         # Wrapper untuk Gradle (Linux/Mac)
    ├── gradlew.bat                                                     # Wrapper untuk Gradle (Windows)
    ├── config.properties                                               # File konfigurasi proyek
    └── README.md                                                       # Dokumentasi proyek


### :zap: Hasil Report API Test With Cucumber
<img width="1206" height="291" alt="image" src="https://github.com/user-attachments/assets/ee35ffe2-d0dd-495f-9313-59d4fe8bbea0" />

### :zap: Hasil Report WEB Test With Cucumber
<img width="1206" height="292" alt="image" src="https://github.com/user-attachments/assets/b5995396-d237-4c3f-98ba-92b10d9c505a" />

### :zap: Github Actions API
<img width="1324" height="684" alt="image" src="https://github.com/user-attachments/assets/6655f9cd-24d8-4dc3-a770-e6308b3e12e6" />

### :zap: Github Actions WEB
<img width="1329" height="668" alt="image" src="https://github.com/user-attachments/assets/6a9be125-c6c9-4f2a-8c57-232e4ebf2eea" />

### :zap: Hasil Report API Test With Github Action
<img width="1201" height="291" alt="image" src="https://github.com/user-attachments/assets/3e7d4ef0-6cfb-4a20-9cc0-591e4e609b2c" />

### :zap: Hasil Report WEB Test With Github Action
<img width="1288" height="318" alt="image" src="https://github.com/user-attachments/assets/1cb5af5c-3424-45c0-b6c8-ba3b49799d08" />




