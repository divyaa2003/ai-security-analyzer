package com.example.demo;

import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import java.io.File;

public class ThreatClassifier {
    private J48 tree;
    private Instances dataset;

    public ThreatClassifier(String datasetPath) throws Exception {
        loadDataset(datasetPath);
        trainModel();
    }

    private void loadDataset(String datasetPath) throws Exception {
        File datasetFile = new File(datasetPath);
        if (!datasetFile.exists()) {
            throw new IllegalArgumentException("Dataset file not found: " + datasetPath);
        }
        
        DataSource source = new DataSource(datasetPath);
        dataset = source.getDataSet();

        if (dataset == null) {
            throw new IllegalArgumentException("Error loading dataset: " + datasetPath);
        }

        if (dataset.classIndex() == -1) {
            dataset.setClassIndex(dataset.numAttributes() - 1); // Set last attribute as class
        }
    }

    private void trainModel() throws Exception {
        if (dataset == null) {
            throw new IllegalStateException("Dataset not loaded properly.");
        }

        tree = new J48();
        tree.buildClassifier(dataset);
    }

    public String predictThreat(double requestLength, String sqlInjection, String xssAttack, 
                                String ddos, String phishing, String mitm, String zeroDay) throws Exception {
        if (dataset == null || tree == null) {
            throw new IllegalStateException("Model or dataset is not initialized.");
        }

        double[] values = new double[dataset.numAttributes()];
        values[0] = requestLength;

        // Validate categorical attributes
        values[1] = getAttributeValueIndex(1, sqlInjection);
        values[2] = getAttributeValueIndex(2, xssAttack);
        values[3] = getAttributeValueIndex(3, ddos);
        values[4] = getAttributeValueIndex(4, phishing);
        values[5] = getAttributeValueIndex(5, mitm);
        values[6] = getAttributeValueIndex(6, zeroDay);

        Instance newInstance = new DenseInstance(1.0, values);
        newInstance.setDataset(dataset);

        double predictionIndex = tree.classifyInstance(newInstance);
        return dataset.classAttribute().value((int) predictionIndex);
    }

    private double getAttributeValueIndex(int attributeIndex, String value) {
        if (dataset.attribute(attributeIndex).indexOfValue(value) == -1) {
            throw new IllegalArgumentException("Invalid value '" + value + "' for attribute " + dataset.attribute(attributeIndex).name());
        }
        return dataset.attribute(attributeIndex).indexOfValue(value);
    }
}
