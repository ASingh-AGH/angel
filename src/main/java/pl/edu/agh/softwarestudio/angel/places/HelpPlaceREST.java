package pl.edu.agh.softwarestudio.angel.places;

import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import pl.edu.agh.softwarestudio.angel.location.LocationRepo;
import pl.edu.agh.softwarestudio.angel.location.LocationRepoService;
import java.util.List;

@RestController
@RequestMapping("/api/places")
public class HelpPlaceREST {

    HelpPlaceRepo helpPlaceRepo;
    LocationRepo locationRepo;

    {
        helpPlaceRepo = new HelpPlaceRepoService().getRepo();
        locationRepo = new LocationRepoService().getRepo();
    }


    @GetMapping
    public List<HelpPlace> getPage(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "itemsPerPage", defaultValue = "10") int itemsPerPage
    )  { //TODO exception on not int
        return helpPlaceRepo.findAll(PageRequest.of(page, itemsPerPage)).getContent();
    }

//    @GetMapping("all")
//    public Flux<HelpPlace> listPlacesAll() {
//        return helpPlaceRepo.findAll();
//    }

    @PostMapping
    public HelpPlace reportNewHelpPlace(
            @RequestBody HelpPlace place
    ){
        //TODO Security checks, if user authenticated
        place.setAccepted(false);
        place.setId(null);
        place.getLoc().setId(null);
        return helpPlaceRepo.save(place);
    }

    @GetMapping("/{placeId}")
    public HelpPlace getPlaceById(@PathVariable("placeId") Long placeId){
        return helpPlaceRepo.findById(placeId).get();
    }
}
