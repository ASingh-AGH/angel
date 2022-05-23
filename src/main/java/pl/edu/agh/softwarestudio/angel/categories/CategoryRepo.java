package pl.edu.agh.softwarestudio.angel.categories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CategoryRepo extends ReactiveCrudRepository<Category, Long>  {
}
