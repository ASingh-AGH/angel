package project.softwarestudio.angel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RESTApiController {
    /**
     * Test method used to check configuration of environment
     * @return			Debug string
     */
    @GetMapping("/api/info")
    public String info() {
        return "Angel REST API is working!";
    }

    @GetMapping("/api/list/places")
    public ArrayList<HelpPlace> listPlaces(
            @RequestParam(value = "limit", defaultValue = "100") String limit,
            @RequestParam(value = "firstEl", defaultValue = "-1") String firstEl
    ) {
        return TestDataSet.hp();
    }


    @GetMapping("/api/list/offers")
    public ArrayList<HelpOffer> listOffers(
            @RequestParam(value = "limit", defaultValue = "100") String limit,
            @RequestParam(value = "firstEl", defaultValue = "-1") String firstEl
    ) {
        return TestDataSet.ho();
    }

    /*
    *
    @GetMapping("/api/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    * */

}
