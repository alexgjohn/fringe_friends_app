import models.Friend;
import models.Recommendation;
import models.Show;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class RecommendationTest {

    private Show show;
    private Friend friend1;

    private Recommendation recommendation;

    @Before
    public void before(){
        show = new Show("Murder She Didn't Write", 12);
        LocalDate date1 = LocalDate.of(2023, 8, 12);
        LocalDate date2 = LocalDate.of(2023, 8, 13);
        LocalDate date3 = LocalDate.of(2023, 8, 14);
        show.addDate(date1);
        show.addDate(date2);
        friend1 = new Friend("Jack", 32);
        friend1.addAvailableDate(date2);
        friend1.addAvailableDate(date3);
        recommendation = new Recommendation(show, friend1);
    }

    @Test
    public void hasShow(){
        assertEquals(show, recommendation.getShow());
    }

    @Test
    public void hasFriend(){
        assertEquals(friend1, recommendation.getFriend());
    }

    @Test
    public void startsWithEmptyListOfPossibleDates(){
        assertEquals(0, recommendation.getPossibleDates().size());
    }

    @Test
    public void canCalculatePossibleDates(){
        recommendation.calculatePossibleDates();
        assertEquals(1, recommendation.getPossibleDates().size());
    }
}
