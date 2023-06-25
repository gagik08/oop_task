package com.example.zooNutritionManagment.models;

public class Animal {
    private final String gender;
    private final String name;
    private final int age;

    public Animal(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  "\n\t\tGender: " + getGender() +
                ", \n\t\tName: " + getName() +
                ", \n\t\tAge: " + getAge();
    }
}
