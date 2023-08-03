package other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import repositories.FriendRepository;
import repositories.RecommendationRepository;
import repositories.ShowRepository;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    RecommendationRepository recommendationRepository;

    @Autowired
    FriendRepository friendRepository;

    @Autowired
    ShowRepository showRepository;

    @Override
    public void run(ApplicationArguments args){

    }
}
