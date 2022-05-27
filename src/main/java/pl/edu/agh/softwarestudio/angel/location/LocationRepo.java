package pl.edu.agh.softwarestudio.angel.location;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;

public interface LocationRepo extends ReactiveCrudRepository<Location, Long> {
}
