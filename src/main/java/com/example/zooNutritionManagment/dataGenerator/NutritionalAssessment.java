package com.example.zooNutritionManagment.dataGenerator;

import com.example.zooNutritionManagment.models.Animal;

public class NutritionalAssessment {
    private Animal animal;
    private String assessmentDate;
    private String assessmentResult;

    public NutritionalAssessment(Animal animal, String assessmentDate, String assessmentResult) {
        this.animal = animal;
        this.assessmentDate = assessmentDate;
        this.assessmentResult = assessmentResult;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(String assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public String getAssessmentResult() {
        return assessmentResult;
    }

    public void setAssessmentResult(String assessmentResult) {
        this.assessmentResult = assessmentResult;
    }

    public void printAssessmentInfo() {
        String sb = "Animal: " + getAnimal() + "\n" +
                "Assessment Date: " + getAssessmentDate() + "\n" +
                "Assessment Result: " + getAssessmentResult();

        System.out.println(sb);
    }

}
