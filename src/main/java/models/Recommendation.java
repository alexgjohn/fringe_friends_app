package models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "recommendations")
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;

    @ManyToOne
    @JoinColumn(name = "friend_id", nullable = false)
    private Friend friend;

    @Column(name = "possible_dates")
    private ArrayList<LocalDate> possibleDates;

    public Recommendation() {
    }

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
