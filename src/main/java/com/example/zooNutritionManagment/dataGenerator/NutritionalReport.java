package com.example.zooNutritionManagment.dataGenerator;

import com.example.zooNutritionManagment.models.Animal;

import java.time.LocalDate;

public class NutritionalReport {
    private Animal animal;
    private final LocalDate reportDate;
    private final NutritionalData nutritionalData;

    public NutritionalReport(Animal animal) {
        this.animal = animal;
        this.reportDate = LocalDate.now();
        nutritionalData = new NutritionalData();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }


    public NutritionalData getNutritionalData() {
        return nutritionalData;
    }

    public void generateReport() {
        String sb = "Nutritional Report:\n" +
                "\t\t\t\t\tReport Date: " + reportDate + "\n" +
                nutritionalData.displayAllNutrients();
        System.out.println(sb);
    }
}
