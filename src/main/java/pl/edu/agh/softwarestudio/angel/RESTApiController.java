package pl.edu.agh.softwarestudio.angel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.agh.softwarestudio.angel.offers.HelpOffer;
import pl.edu.agh.softwarestudio.angel.places.HelpPlace;
import pl.edu.agh.softwarestudio.angel.places.HelpPlaceRepo;
import reactor.core.publisher.Flux;

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



    /*
    *
    @GetMapping("/api/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    * */

}
