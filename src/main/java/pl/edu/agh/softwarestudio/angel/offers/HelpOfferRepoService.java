package pl.edu.agh.softwarestudio.angel.offers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import pl.edu.agh.softwarestudio.angel.AngelApplication;

@Service
public class HelpOfferRepoService {
    @Autowired
    private HelpOfferRepo helpOfferRepo;

//    static{
//        helpOfferRepo = AngelApplication.ctx.getBean(HelpOfferRepo.class);
//    }

    public HelpOfferRepo getRepo(){
        return helpOfferRepo;
    }
}
