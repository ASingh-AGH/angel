package pl.edu.agh.softwarestudio.angel.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/category")
public class CategoryREST {
    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping
    public Flux<Category> getAll(){
        return categoryRepo.findAll();
    }

    @GetMapping("/{cat}")
    public Mono<Category> getOneById(@PathVariable("cat") Long categoryId){
        return categoryRepo.findById(categoryId);
    }
}
