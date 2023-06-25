package com.example.zooNutritionManagment;
import com.example.zooNutritionManagment.feeding.DietFormulation;
import com.example.zooNutritionManagment.models.Animal;
import com.example.zooNutritionManagment.dataGenerator.NutritionalAssessment;
import com.example.zooNutritionManagment.dataGenerator.NutritionalData;
import com.example.zooNutritionManagment.dataGenerator.NutritionalReport;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create ZooManagement instance
        ZooManagement zooManagement = new ZooManagement("Safari World", "Tbilisi, Georgia", 10, 50, "9:00 AM - 5:00 PM");


        // Print zoo information
        zooManagement.printZooInfo(zooManagement);

        // Update opening hours
        zooManagement.updateOpeningHours("10:00 AM - 6:00 PM");
        zooManagement.printUpdatedOpeningHours();

        // Hire staff
        zooManagement.hireStaff();
        zooManagement.printUpdatedStaffCount();

        // Fire staff
        zooManagement.fireStaff();
        zooManagement.printUpdatedStaffCount();

        Animal lion = new Animal("Male", "Lion", 15);

        // Create NutritionalAssessment instance
        NutritionalAssessment nutritionalAssessment = new NutritionalAssessment(lion, "2023-06-25", "Good");

        // Print nutritional assessment information
        nutritionalAssessment.printAssessmentInfo();

        // Create DietFormulation instance
        DietFormulation dietFormulation = new DietFormulation();

        // Set nutrient requirements for Lion species
        Map<String, Double> lionRequirements = new HashMap<>();
        lionRequirements.put("Protein", 30.0);
        lionRequirements.put("Fat", 10.0);
        dietFormulation.setNutrientRequirements("Lion", lionRequirements);

        // Formulate diet for Lion
        dietFormulation.formulateDiet("Lion", "Meat, Bones, Vegetables");

        // Print formulated diet for Lion
        dietFormulation.printFormulatedDiet("Lion");

        // Create NutritionalData instance
        NutritionalData nutritionalData = new NutritionalData();

        // Set nutrient values for Protein and Fat
        nutritionalData.setNutrientValue("Protein", 25.0);
        nutritionalData.setNutrientValue("Fat", 8.0);

        // Create NutritionalReport instance
        NutritionalReport nutritionalReport = new NutritionalReport(lion);

        // Set nutrient values for the nutritional report
        NutritionalData reportNutritionalData = nutritionalReport.getNutritionalData();
        reportNutritionalData.setNutrientValue("Protein", 25.0);
        reportNutritionalData.setNutrientValue("Fat", 8.0);

        // Print nutritional report
        nutritionalReport.generateReport();
    }
}



