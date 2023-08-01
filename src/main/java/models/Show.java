package models;

import models.enums.Tag;

import java.time.LocalDate;
import java.util.ArrayList;

public class Show {

    private String title;

    private ArrayList<LocalDate> dates;

    private ArrayList<Tag> tags;

    private int ageLimit;

    public Show(String title, int ageLimit) {
        this.title = title;
        this.dates = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.ageLimit = ageLimit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<LocalDate> getDates() {
        return dates;
    }

    public void setDates(ArrayList<LocalDate> dates) {
        this.dates = dates;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public void addDate(LocalDate dateAdded) {
        this.dates.add(dateAdded);
    }

    public void addTag(Tag tagAdded) {
        this.tags.add(tagAdded);
    }
}
