The [AI Security Analyzer](https://github.com/divyaa2003/ai-security-analyzer) is a Spring Boot-based web application that leverages a machine learning model to detect potential web threats such as SQL Injection, XSS, DDoS, and Phishing. It utilizes a decision tree classifier (J48) from WEKA and provides a user-friendly interface for threat analysis.

---

## 🧠 Features

* **ML-Based Threat Detection**: Employs a trained J48 decision tree model to predict threats based on user inputs.
* **Interactive Dashboard**: Visualizes threat severity using Chart.js.
* **User-Friendly Interface**: Offers a web form for submitting input patterns and viewing real-time predictions.
* **Comprehensive Threat Analysis**: Identifies various web attacks, enhancing security measures.

---

## 🛠️ Tech Stack

* **Backend**: Spring Boot (Java)
* **Machine Learning**: WEKA (J48 decision tree classifier)
* **Frontend**: Thymeleaf, HTML/CSS, Bootstrap
* **Visualization**: Chart.js

---

## 📁 Project Structure

```
.
├── src/main/java/com/example/demo
│   ├── SecurityAnalyzerController.java
│   ├── ThreatClassifier.java
│   └── ...
├── src/main/resources/templates
│   └── index.html
├── mydb.sqlite
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

* Java 17 or higher
* Maven

### Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/divyaa2003/ai-security-analyzer.git
   cd ai-security-analyzer
   ```

2. **Run the Application**:

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access the Application**:

   Open your browser and navigate to [http://localhost:8080](http://localhost:8080)

---

## 🧪 Usage

* **Input Submission**: Enter the pattern or data you wish to analyze in the provided web form.
* **Threat Prediction**: The application processes the input through the ML model and displays the predicted threat level.
* **Visualization**: View the threat severity chart for a graphical representation of the analysis.([GitHub][1], [GitHub][2])

---

## 📝 Notes

* **Model Training**: The WEKA model (`mydb.sqlite`) is pre-trained. For retraining or updates, ensure WEKA is properly configured.
* **Customization**: You can modify the frontend templates located in `src/main/resources/templates` to better fit your needs.

---

## 📄 License

This project is licensed under the MIT License.

---

For more details, visit the [GitHub Repository](https://github.com/divyaa2003/ai-security-analyzer).

[1]: https://github.com/PortSwigger/ai-http-analyzer?utm_source=chatgpt.com "PortSwigger/ai-http-analyzer - GitHub"
[2]: https://github.com/xvnpw/ai-security-analyzer?utm_source=chatgpt.com "xvnpw/ai-security-analyzer - GitHub"

