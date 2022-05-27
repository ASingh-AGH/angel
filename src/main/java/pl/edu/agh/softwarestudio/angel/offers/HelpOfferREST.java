package pl.edu.agh.softwarestudio.angel.offers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/offer")
public class HelpOfferREST {


    HelpOfferRepo helpOfferRepo;

    {
        helpOfferRepo = new HelpOfferRepoService().getRepo();
    }

    @GetMapping
    public List<HelpOffer> getPage(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "itemsPerPage", defaultValue = "10") int itemsPerPage
    ) {

        return helpOfferRepo.findAll(PageRequest.of(page,itemsPerPage)).getContent();
    }

    @PostMapping
    public HelpOffer createNewHelpOffer(
            @RequestBody HelpOffer helpOffer
    ){
        //TODO verify if user is signed in
        //helpOffer.setCreatorUserId(<userId>);
        helpOffer.setId(null);
        return helpOfferRepo.save(helpOffer);
    }
    @GetMapping("/{offerId}")
    public HelpOffer getHelpOfferById(@PathVariable("offerId") Integer offerId){
        return helpOfferRepo.findById(offerId).get();
    }
}
