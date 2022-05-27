package pl.edu.agh.softwarestudio.angel.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryREST {
    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping
    public List<Category> getAll(){
        return categoryRepo.findAll();
    }

    @GetMapping("/{cat}")
    public Optional<Category> getOneById(@PathVariable("cat") Integer categoryId){
        return categoryRepo.findById(categoryId);
    }
}
