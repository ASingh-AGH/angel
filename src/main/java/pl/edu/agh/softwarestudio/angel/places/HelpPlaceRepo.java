package pl.edu.agh.softwarestudio.angel.places;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface HelpPlaceRepo extends ReactiveCrudRepository<HelpPlace, Long> {

    @Query("select * from HelpPlace ORDER BY id DESC LIMIT $1 OFFSET $2")
    Flux<HelpPlace> selectOffset(int limit, int offset);
}