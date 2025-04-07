package com.example.demo;

public class FeatureExtractor {
    public static double[] extractFeatures(String[] logData) {
        double sourceIp = logData[0].hashCode() % 1000;  
        double eventType = logData[2].equals("attack") ? 1.0 : 0.0;
        double threatLevel = Double.parseDouble(logData[3]);

        return new double[]{sourceIp, eventType, threatLevel};
    }
}
