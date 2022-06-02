package pl.edu.agh.softwarestudio.angel.places;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import pl.edu.agh.softwarestudio.angel.AngelApplication;

@Service
public class HelpPlaceRepoService {
    @Autowired
    private static HelpPlaceRepo helpPlaceRepo;

    static {
        helpPlaceRepo = AngelApplication.ctx.getBean(HelpPlaceRepo.class);
    }

    public HelpPlaceRepo getRepo(){
        return helpPlaceRepo;
    }
}
