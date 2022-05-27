package pl.edu.agh.softwarestudio.angel.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class LocationRepoService {
    @Autowired
    private static LocationRepo locationRepo;

    private static ApplicationContext ctx;

    static{
        ctx = new AnnotationConfigApplicationContext();
        locationRepo = ctx.getBean(LocationRepo.class);
    }
    public LocationRepo getRepo(){
        return locationRepo;
    }

}
