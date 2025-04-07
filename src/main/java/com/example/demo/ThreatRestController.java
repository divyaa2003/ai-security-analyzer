package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/threats")
public class ThreatRestController {

    @GetMapping
    public List<Threat> getThreats() {
        return List.of(
            new Threat("SQL Injection", "High"),
            new Threat("XSS", "Medium"),
            new Threat("DDoS Attack", "Severe"),
            new Threat("Phishing", "High"),
            new Threat("Man-in-the-Middle", "Severe"),
            new Threat("Zero-Day Exploit", "Critical")
        );
    }
}
