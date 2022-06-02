package pl.edu.agh.softwarestudio.angel.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import pl.edu.agh.softwarestudio.angel.AngelApplication;

@Service
public class CategoryRepoService {
    @Autowired
    private static CategoryRepo categoryRepo;

    static {

        categoryRepo = AngelApplication.ctx.getBean(CategoryRepo.class);
    }

    public CategoryRepo getRepo(){
        return categoryRepo;
    }
}
