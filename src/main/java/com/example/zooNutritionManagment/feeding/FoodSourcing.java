package com.example.zooNutritionManagment.feeding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodSourcing {
    private final List<String> supplierList;
    private final List<String> farmList;
    private final List<String> distributorList;
    private final Map<String, Integer> currentInventory;
    private double budget;

    public FoodSourcing() {
        supplierList = new ArrayList<>();
        farmList = new ArrayList<>();
        distributorList = new ArrayList<>();
        currentInventory = new HashMap<>();
        budget = 0.0;
    }

    public void addSupplier(String supplier) {
        supplierList.add(supplier);
    }

    public void removeSupplier(String supplier) {
        supplierList.remove(supplier);
    }

    public List<String> getSuppliers() {
        return supplierList;
    }

    public void addFarm(String farm) {
        farmList.add(farm);
    }

    public void removeFarm(String farm) {
        farmList.remove(farm);
    }

    public List<String> getFarms() {
        return farmList;
    }

    public void addDistributor(String distributor) {
        distributorList.add(distributor);
    }

    public void removeDistributor(String distributor) {
        distributorList.remove(distributor);
    }

    public List<String> getDistributors() {
        return distributorList;
    }

    public void updateInventory(String item, int quantity) {
        int currentQuantity = currentInventory.getOrDefault(item, 0);
        currentInventory.put(item, currentQuantity + quantity);
    }

    public Map<String, Integer> getCurrentInventory() {
        return currentInventory;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
