package pl.edu.agh.softwarestudio.angel.categories;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
