package other;

import models.Show;
import models.enums.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import repositories.FriendRepository;
import repositories.RecommendationRepository;
import repositories.ShowRepository;

import java.time.LocalDate;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    RecommendationRepository recommendationRepository;

    @Autowired
    FriendRepository friendRepository;

    @Autowired
    ShowRepository showRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){

        recommendationRepository.deleteAll();
        friendRepository.deleteAll();
        showRepository.deleteAll();

        //dates! to be reused for anh friends and shows. they match up with the fringe dates, of course
        LocalDate date4 = LocalDate.of(2023, 8, 4);
        LocalDate date5 = LocalDate.of(2023, 8, 5);
        LocalDate date6 = LocalDate.of(2023, 8, 6);
        LocalDate date7 = LocalDate.of(2023, 8, 7);
        LocalDate date8 = LocalDate.of(2023, 8, 8);
        LocalDate date9 = LocalDate.of(2023, 8, 9);
        LocalDate date10 = LocalDate.of(2023, 8, 10);
        LocalDate date11 = LocalDate.of(2023, 8, 11);
        LocalDate date12 = LocalDate.of(2023, 8, 12);
        LocalDate date13 = LocalDate.of(2023, 8, 13);
        LocalDate date14 = LocalDate.of(2023, 8, 14);
        LocalDate date15 = LocalDate.of(2023, 8, 15);
        LocalDate date16 = LocalDate.of(2023, 8, 16);
        LocalDate date17 = LocalDate.of(2023, 8, 17);
        LocalDate date18 = LocalDate.of(2023, 8, 18);
        LocalDate date19 = LocalDate.of(2023, 8, 19);
        LocalDate date20 = LocalDate.of(2023, 8, 20);
        LocalDate date21 = LocalDate.of(2023, 8, 21);
        LocalDate date22 = LocalDate.of(2023, 8, 22);
        LocalDate date23 = LocalDate.of(2023, 8, 23);
        LocalDate date24 = LocalDate.of(2023, 8, 24);
        LocalDate date25 = LocalDate.of(2023, 8, 25);
        LocalDate date26 = LocalDate.of(2023, 8, 26);
        LocalDate date27 = LocalDate.of(2023, 8, 27);
        LocalDate date28 = LocalDate.of(2023, 8, 28);

        Show show1 = new Show("Murder She Didn't Write", 12);
        show1.addDate(date4);
        show1.addDate(date5);
        show1.addDate(date6);
        show1.addDate(date7);
        show1.addTag(Tag.COMEDY);
        show1.addTag(Tag.IMPROVISATION);
        showRepository.save(show1);

    }
}
