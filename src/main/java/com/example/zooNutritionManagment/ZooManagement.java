package com.example.zooNutritionManagment;

class ZooManagement {
    private String zooName;
    private String location;
    private int staffCount;
    private int animalCount;
    private String openingHours;

    public ZooManagement(String zooName, String location, int staffCount, int animalCount, String openingHours) {
        this.zooName = zooName;
        this.location = location;
        this.staffCount = staffCount;
        this.animalCount = animalCount;
        this.openingHours = openingHours;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public String getZooName() {
        return zooName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void updateOpeningHours(String hours) {
        openingHours = hours;
    }

    public void printUpdatedOpeningHours(){
        System.out.println("Updated Opening Hours: " + getOpeningHours());
    }

    public void hireStaff() {
        staffCount++;
    }

    public void fireStaff() {
        staffCount--;
    }

    public void printUpdatedStaffCount(){
        System.out.println("Updated Staff Count: " + getStaffCount());
    }

    public void printZooInfo(ZooManagement zooManagement) {
        String sb = "Zoo Name: " + getZooName() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Staff Count: " + getStaffCount() + "\n" +
                "Animal Count: " + getAnimalCount() + "\n" +
                "Opening Hours: " + getOpeningHours();

        System.out.println(sb);
    }

}
