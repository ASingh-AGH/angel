package pl.edu.agh.softwarestudio.angel.location;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface LocationRepo extends ReactiveCrudRepository<Location, Long> {
}
