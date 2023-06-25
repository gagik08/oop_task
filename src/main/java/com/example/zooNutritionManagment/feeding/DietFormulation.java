package com.example.zooNutritionManagment.feeding;

import java.util.HashMap;
import java.util.Map;

public class DietFormulation {
    private final Map<String, Map<String, Double>> nutrientRequirements;
    private final Map<String, String> animalDiets;

    public DietFormulation() {
        nutrientRequirements = new HashMap<>();
        animalDiets = new HashMap<>();
    }

    public void setNutrientRequirements(String species, Map<String, Double> requirements) {
        nutrientRequirements.put(species, requirements);
    }

    public Map<String, Double> getNutrientRequirements(String species) {
        return nutrientRequirements.get(species);
    }

    public void formulateDiet(String animal, String diet) {
        animalDiets.put(animal, diet);
    }

    public String getFormulatedDiet(String animal) {
        return animalDiets.get(animal);
    }

    public void updateFormulatedDiet(String animal, String newDiet) {
        animalDiets.put(animal, newDiet);
    }

    public void removeFormulatedDiet(String animal) {
        animalDiets.remove(animal);
    }

    public void printFormulatedDiet(String animal){
        System.out.println("Formulated Diet for Lion: " + getFormulatedDiet(animal));
    }
}

