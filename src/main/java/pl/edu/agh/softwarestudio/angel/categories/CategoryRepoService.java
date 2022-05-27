package pl.edu.agh.softwarestudio.angel.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CategoryRepoService {
    @Autowired
    private static CategoryRepo categoryRepo;
    private static ApplicationContext ctx;

    static {
        ctx = new AnnotationConfigApplicationContext();
        categoryRepo = ctx.getBean(CategoryRepo.class);
    }

    public CategoryRepo getRepo(){
        return categoryRepo;
    }
}
