package pl.edu.agh.softwarestudio.angel.offers;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface HelpOfferRepo extends ReactiveCrudRepository<HelpOffer, Long> {

    @Query("select * from HelpOffer ORDER BY id DESC LIMIT $1 OFFSET $2")
    Flux<HelpOffer> selectOffset(int limit, int offset);
}
