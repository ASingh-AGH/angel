package pl.edu.agh.softwarestudio.angel.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import pl.edu.agh.softwarestudio.angel.AngelApplication;


@Service
public class LocationRepoService {
    @Autowired
    private LocationRepo locationRepo;

//    static{
//        locationRepo = AngelApplication.ctx.getBean(LocationRepo.class);
//    }
    public LocationRepo getRepo(){
        return locationRepo;
    }

}
