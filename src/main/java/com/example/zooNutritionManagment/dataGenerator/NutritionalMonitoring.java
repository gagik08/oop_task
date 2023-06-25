package com.example.zooNutritionManagment.dataGenerator;

import java.util.ArrayList;
import java.util.List;

public class NutritionalMonitoring {
    private List<String> animals;
    private List<String> nutritionalData;

    public NutritionalMonitoring() {
        animals = new ArrayList<>();
        nutritionalData = new ArrayList<>();
    }

    public void addAnimal(String animal) {
        animals.add(animal);
    }

    public void removeAnimal(String animal) {
        animals.remove(animal);
    }

    public List<String> getAnimals() {
        return animals;
    }

    public void addNutritionalData(String animal, String data) {
        nutritionalData.add(animal + ": " + data);
    }

    public void removeNutritionalData(String animal, String data) {
        nutritionalData.remove(animal + ": " + data);
    }

    public List<String> getNutritionalData() {
        return nutritionalData;
    }
}
