package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Recommendation {

    private Show show;
    private Friend friend;
    private ArrayList<LocalDate> possibleDates;

    public Recommendation(Show show, Friend friend) {
        this.show = show;
        this.friend = friend;
        this.possibleDates = new ArrayList<>();
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public ArrayList<LocalDate> getPossibleDates() {
        return possibleDates;
    }

    public void setPossibleDates(ArrayList<LocalDate> possibleDates) {
        this.possibleDates = possibleDates;
    }

    public void calculatePossibleDates() {
        ArrayList<LocalDate> crossoverDates = new ArrayList<>();
        for (LocalDate showDate:this.show.getDates()){
            if (this.friend.getAvailableDates().contains(showDate)){
                crossoverDates.add(showDate);
            }
        }
        setPossibleDates(crossoverDates);
    }
}
