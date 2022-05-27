package pl.edu.agh.softwarestudio.angel.places;


import lombok.Data;
import pl.edu.agh.softwarestudio.angel.AbstractListItem;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Class that represents place where help is provided
 */
@Entity
@Data
@Table(name="HelpPlace")
public class HelpPlace extends AbstractListItem {
//    @Transient  /* Tells db that the field actually does not exist */
//    private Mono<Location> loc;
    private Integer locationId;
    private boolean accepted;

//    public static HelpPlace createHelpPlace(String name, String desc, int id){
//        var hp = new HelpPlace();
//        hp.id = id;
//        hp.name = name;
//        hp.description = desc;
//        return hp;
//    }
    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */
    @Override
    public String getDetailsUrl() {
        return "/api/details/places/"+this.id+"/";
    }

}
