package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class SecurityAnalyzerController {
    private final ThreatClassifier threatClassifier;

    public SecurityAnalyzerController() throws Exception {
        this.threatClassifier = new ThreatClassifier("src/main/resources/threat_data.arff");
    }
    

    @GetMapping("/")
    public String home(Model model) {
        List<Threat> threats = List.of(
            new Threat("SQL Injection", "High"),
            new Threat("XSS", "Medium"),
            new Threat("DDoS Attack", "Severe"),
            new Threat("Phishing", "High"),
            new Threat("Man-in-the-Middle", "Severe"),
            new Threat("Zero-Day Exploit", "Critical")
        );
        model.addAttribute("threats", threats);
        return "index"; // Loads index.html from templates/
    }

    @PostMapping("/analyze")
    public String analyzeThreat(@RequestParam double requestLength,
                                @RequestParam String sqlInjection,
                                @RequestParam String xssAttack,
                                @RequestParam String ddosAttack,
                                @RequestParam String phishing,
                                @RequestParam String mitm,
                                @RequestParam String zeroDay,
                                Model model) {
        try {
            String prediction = threatClassifier.predictThreat(requestLength, sqlInjection, xssAttack, ddosAttack, phishing, mitm, zeroDay);
            model.addAttribute("prediction", prediction);
        } catch (Exception e) {
            model.addAttribute("error", "Error analyzing threat: " + e.getMessage());
        }
        return "index";
    }
}
