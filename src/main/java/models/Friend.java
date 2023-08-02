package models;

import models.enums.Tag;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "friends")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "available_dates")
    private ArrayList<LocalDate> availableDates;

    @Column(name = "preferences")
    private ArrayList<Tag> preferences;


    public Friend() {
    }

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
