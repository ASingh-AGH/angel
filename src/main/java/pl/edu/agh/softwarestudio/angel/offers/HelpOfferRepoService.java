package pl.edu.agh.softwarestudio.angel.offers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class HelpOfferRepoService {
    @Autowired
    private static HelpOfferRepo helpOfferRepo;
    private static ApplicationContext ctx;

    static{
        ctx = new AnnotationConfigApplicationContext();
        helpOfferRepo = ctx.getBean(HelpOfferRepo.class);
    }

    public HelpOfferRepo getRepo(){
        return helpOfferRepo;
    }
}
