package com.example.zooNutritionManagment;

import java.util.ArrayList;
import java.util.List;

public class Collaboration {
    private final List<String> departments;
    private final List<String> collaborationMembers;

    public Collaboration() {
        departments = new ArrayList<>();
        collaborationMembers = new ArrayList<>();
    }

    public void addDepartment(String department) {
        departments.add(department);
    }

    public void removeDepartment(String department) {
        departments.remove(department);
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void addCollaborationMember(String member) {
        collaborationMembers.add(member);
    }

    public void removeCollaborationMember(String member) {
        collaborationMembers.remove(member);
    }

    public List<String> getCollaborationMembers() {
        return collaborationMembers;
    }
}
