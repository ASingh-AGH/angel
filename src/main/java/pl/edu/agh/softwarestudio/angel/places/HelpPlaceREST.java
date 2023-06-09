package pl.edu.agh.softwarestudio.angel.places;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import pl.edu.agh.softwarestudio.angel.categories.Category;
import pl.edu.agh.softwarestudio.angel.location.LocationRepo;
import pl.edu.agh.softwarestudio.angel.location.LocationRepoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/places")
public class HelpPlaceREST {

    @Autowired
    HelpPlaceRepoService helpPlaceRepoService;
    @Autowired
    LocationRepoService locationRepoService;


    @GetMapping
    public List<HelpPlace> getPage(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "itemsPerPage", defaultValue = "10") int itemsPerPage
    )  { //TODO exception on not int
        return helpPlaceRepoService.getRepo().findAll(PageRequest.of(page, itemsPerPage)).getContent();
    }


    @PostMapping
    public HelpPlace reportNewHelpPlace(
            @RequestBody HelpPlace place
    ){
        //TODO Security checks, if user authenticated
        place.setAccepted(false);
        return helpPlaceRepoService.getRepo().saveAndFlush(place);
    }

    @GetMapping("/{placeId}")
    public HelpPlace getPlaceById(@PathVariable("placeId") Integer placeId){
//        System.out.println(helpPlaceRepoService.getRepo().findById(placeId)+" ################################" + placeId);
        return helpPlaceRepoService.getRepo().findById(placeId).get();
    }
}
