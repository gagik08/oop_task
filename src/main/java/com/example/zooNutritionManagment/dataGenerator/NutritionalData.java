package com.example.zooNutritionManagment.dataGenerator;

import java.util.HashMap;
import java.util.Map;

public class NutritionalData {
    private final Map<String, Double> nutrientValues;

    public NutritionalData() {
        nutrientValues = new HashMap<>();
    }

    public void setNutrientValue(String nutrient, double value) {
        nutrientValues.put(nutrient, value);
    }

    public double getNutrientValue(String nutrient) {
        return nutrientValues.getOrDefault(nutrient, 0.0);
    }

    public void removeNutrient(String nutrient) {
        nutrientValues.remove(nutrient);
    }

    public String displayAllNutrients() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t\t\t\tNutrient Values:\n");
        for (Map.Entry<String, Double> entry : nutrientValues.entrySet()) {
            String nutrient = entry.getKey();
            double value = entry.getValue();
            sb.append("\t\t\t\t\t\t\t\t\t").append(nutrient).append(": ").append(value).append("\n");
        }
        return sb.toString();
    }
}

