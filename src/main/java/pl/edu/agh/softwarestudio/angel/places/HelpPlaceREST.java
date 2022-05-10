package pl.edu.agh.softwarestudio.angel.places;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/places")
public class HelpPlaceREST {
    @Autowired
    HelpPlaceRepo helpPlaceRepo;

    /**
     * GET Request /api/list/places/ showing places from database with offset from the
     * @param limit limit of displayed elements
     * @param offset offset of data
     * @return
     */
    @GetMapping("list")
    public Flux<HelpPlace> listPlaces(
            @RequestParam(value = "limit", defaultValue = "100") int limit,
            @RequestParam(value = "offset", defaultValue = "0") int offset
    ) { //TODO exception on not int
        return helpPlaceRepo.selectOffset(limit, offset);
    }

    @GetMapping("all")
    public Flux<HelpPlace> listPlacesAll() {
        return helpPlaceRepo.findAll();
    }

    @PostMapping("newHelpPlace")
    public Mono<HelpPlace> reportNewHelpPlace(
            @RequestBody HelpPlace place
    ){
        //TODO Security checks, if user authenticated
        place.setAccepted(false);
        place.setId(null);

        return helpPlaceRepo.save(place);
    }
}
