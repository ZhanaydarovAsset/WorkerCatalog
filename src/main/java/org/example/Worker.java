package org.example;

import java.util.Date;

public class Worker {
    private int id;
    private String phoneNumber;
    private String name;
    private int startYear;

    public Worker(int id, String phoneNumber, String name, int startYear) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.startYear = startYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int currentYear = calendar.get(java.util.Calendar.YEAR);
        return currentYear - this.startYear;
    }

    public void setExperience(int startYear) {
        this.startYear = startYear;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", startYear=" + startYear +
                '}';
    }
}
