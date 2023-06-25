package com.example.zooNutritionManagment.feeding;

import com.example.zooNutritionManagment.models.Animal;

public class FeedingSchedule {
    private Animal animal;
    private String schedule;

    public FeedingSchedule(Animal animal, String schedule) {
        this.animal = animal;
        this.schedule = schedule;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
