package pl.edu.agh.softwarestudio.angel.location;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
public class LocationREST {
    @Autowired
    private LocationRepoService locationRepoService;

    @GetMapping("/{id}")
    public Location getLocation(@PathVariable("id") Integer id){
        return locationRepoService.getRepo().getById(id);
    }
}
