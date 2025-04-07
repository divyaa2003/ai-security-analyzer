package com.example.demo;

public class Threat {
    private String name;
    private String severity;

    public Threat(String name, String severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() { return name; }
    public String getSeverity() { return severity; }

    public void setName(String name) { this.name = name; }
    public void setSeverity(String severity) { this.severity = severity; }
}
