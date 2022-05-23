package pl.edu.agh.softwarestudio.angel.places;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.agh.softwarestudio.angel.location.Location;
import pl.edu.agh.softwarestudio.angel.location.LocationRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/places")
public class HelpPlaceREST {
    @Autowired
    HelpPlaceRepo helpPlaceRepo;
    @Autowired
    LocationRepo locationRepo;

    /**
     * GET Request /api/list/places/ showing places from database with offset from the
     * @param limit limit of displayed elements
     * @param offset offset of data
     * @return
     */
    @GetMapping
    public Flux<HelpPlace> listPlaces(
            @RequestParam(value = "limit", defaultValue = "100") int limit,
            @RequestParam(value = "offset", defaultValue = "0") int offset
    ) { //TODO exception on not int
        return helpPlaceRepo.selectOffset(limit, offset);
    }

//    @GetMapping("all")
//    public Flux<HelpPlace> listPlacesAll() {
//        return helpPlaceRepo.findAll();
//    }

    @PostMapping
    public Mono<HelpPlace> reportNewHelpPlace(
            @RequestBody HelpPlace place
    ){
        //TODO Security checks, if user authenticated
        place.setAccepted(false);
        place.setId(null);
        Mono<Location> newLocation = locationRepo.save(place.getLoc());
        place.setLocationId(newLocation.block().getId());
        place.setLoc(null);
        return helpPlaceRepo.save(place);
    }

    @GetMapping("/{placeId}")
    public Mono<HelpPlace> getPlaceById(@PathVariable("placeId") Long placeId){
        return helpPlaceRepo.findById(placeId);
    }
}
