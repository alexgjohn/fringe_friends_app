import models.Friend;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class FriendTest {

    private Friend friend1;

    @Before
    public void before(){
        friend1 = new Friend("Jack", 32);
    }

    @Test
    public void hasName(){
        assertEquals("Jack", friend1.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(32, friend1.getAge());
    }

    @Test
    public void hasEmptyListOfAvailableDates(){
        assertEquals(0, friend1.getAvailableDates().size());
    }

    @Test
    public void canAddAvailableDates(){
        LocalDate date1 = LocalDate.of(2023, 8, 17);
        friend1.addAvailableDate(date1);
        assertEquals(1, friend1.getAvailableDates().size());
    }

    @Test
    public void canRemoveAvailableDates(){
        LocalDate date1 = LocalDate.of(2023, 8, 17);
        friend1.addAvailableDate(date1);
        LocalDate date2 = LocalDate.of(2023, 8, 18);
        friend1.addAvailableDate(date2);
        friend1.removeAvailableDate(date1);
        assertEquals(1, friend1.getAvailableDates().size());
    }

    @Test
    public void hasEmptyListOfPreferences(){
        assertEquals(0, friend1.getPreferences().size());
    }
}
