package models;

import models.enums.Tag;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "dates")
    private ArrayList<LocalDate> dates;

    @Column(name = "tags")
    private ArrayList<Tag> tags;

    @Column(name = "age_limit")
    private int ageLimit;

    public Show() {
    }

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
