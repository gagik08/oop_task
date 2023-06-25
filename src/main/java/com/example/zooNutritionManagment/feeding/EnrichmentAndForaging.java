package com.example.zooNutritionManagment.feeding;

import java.util.ArrayList;
import java.util.List;

public class EnrichmentAndForaging {
    private final List<String> enrichmentActivities;
    private final List<String> foragingMaterials;

    public EnrichmentAndForaging() {
        enrichmentActivities = new ArrayList<>();
        foragingMaterials = new ArrayList<>();
    }

    public void addEnrichmentActivity(String activity) {
        enrichmentActivities.add(activity);
    }

    public void removeEnrichmentActivity(String activity) {
        enrichmentActivities.remove(activity);
    }

    public List<String> getEnrichmentActivities() {
        return enrichmentActivities;
    }

    public void addForagingMaterial(String material) {
        foragingMaterials.add(material);
    }

    public void removeForagingMaterial(String material) {
        foragingMaterials.remove(material);
    }

    public List<String> getForagingMaterials() {
        return foragingMaterials;
    }
}
