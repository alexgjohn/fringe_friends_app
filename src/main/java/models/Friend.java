package models;

import models.enums.Tag;

import java.time.LocalDate;
import java.util.ArrayList;

public class Friend {

    private String name;

    private int age;

    private ArrayList<LocalDate> availableDates;

    private ArrayList<Tag> preferences;

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
        this.availableDates = new ArrayList<>();
        this.preferences = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<LocalDate> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(ArrayList<LocalDate> availableDates) {
        this.availableDates = availableDates;
    }

    public ArrayList<Tag> getPreferences() {
        return preferences;
    }

    public void setPreferences(ArrayList<Tag> preferences) {
        this.preferences = preferences;
    }

    public void addAvailableDate(LocalDate dateToAdd) {
        this.availableDates.add(dateToAdd);
    }

    public void removeAvailableDate(LocalDate dateToRemove) {
        this.availableDates.remove(dateToRemove);
    }

    public void addPreference(Tag tagToAdd) {
        this.preferences.add(tagToAdd);
    }
}
