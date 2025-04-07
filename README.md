# 🔐 AI-Powered Security Analyzer

An intelligent threat detection system that analyzes potential web attacks like SQL Injection, XSS, DDoS, Phishing, and more — using a trained machine learning model built with WEKA and integrated into a Spring Boot web app.

---

## 🚀 Features

- 🧠 ML-based threat prediction using decision tree (J48)
- 📊 Dashboard with threat severity chart (Chart.js)
- 📝 Web-based form for analyzing threats
- 💡 Displays real-time prediction based on input patterns

---

## 💻 Tech Stack

- **Spring Boot** (Java backend)
- **WEKA** (ML model for classification)
- **Thymeleaf + HTML/CSS/JS**
- **Bootstrap** for UI styling
- **Chart.js** for threat visualization

---

## 📂 Project Structure

```bash
.
├── src/main/java/com/example/demo
│   ├── SecurityAnalyzerController.java
│   ├── ThreatClassifier.java
│   └── Threat.java
├── src/main/resources
│   └── templates/index.html
├── threat_data.arff          # ML dataset used to train the model
├── pom.xml                   # Maven dependencies
└── README.md

