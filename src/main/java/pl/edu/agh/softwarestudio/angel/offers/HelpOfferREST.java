package pl.edu.agh.softwarestudio.angel.offers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HelpOfferREST {

    @Autowired
    HelpOfferRepo helpOfferRepo;

    @GetMapping("/api/list/offers")
    public Flux<HelpOffer> listOffers(
            @RequestParam(value = "limit", defaultValue = "100") int limit,
            @RequestParam(value = "offset", defaultValue = "0") int offset
    ) {
        return helpOfferRepo.selectOffset(limit,offset);
    }

    @PostMapping("/api/create/offer")
    public Mono<HelpOffer> createNewHelpOffer(
            @RequestBody HelpOffer helpOffer
    ){
        //TODO verify if user is signed in
        //helpOffer.setCreatorUserId(<userId>);
        helpOffer.setId(null);
        return helpOfferRepo.save(helpOffer);
    }
}
