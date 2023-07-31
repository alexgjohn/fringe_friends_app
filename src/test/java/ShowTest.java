import models.Show;
import models.Tag;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ShowTest {

    private Show show;


    @Before
    public void before(){
        show = new Show("Murder She Didn't Write", 12);


    }

    @Test
    public void hasTitle(){
        assertEquals("Murder She Didn't Write", show.getTitle());
    }



    @Test
    public void hasEmptyListOfDates(){
        assertEquals(0, show.getDates().size());
    }

    @Test
    public void canAddDates(){
        LocalDate date1 = LocalDate.of(2023, 8, 12);
        LocalDate date2 = LocalDate.of(2023, 8, 13);
        show.addDate(date1);
        show.addDate(date2);
        assertEquals(2, show.getDates().size());
    }

    @Test
    public void hasEmptyListOfTags(){
        assertEquals(0, show.getTags().size());
    }

    @Test
    public void canAddTags(){
        show.addTag(Tag.COMEDY);
        show.addTag(Tag.IMPROVISATION);
        assertEquals(2, show.getTags().size());
    }

    @Test
    public void hasAgeLimit(){
        assertEquals(12, show.getAgeLimit());
    }
}
