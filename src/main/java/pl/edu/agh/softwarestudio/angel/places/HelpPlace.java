package pl.edu.agh.softwarestudio.angel.places;


import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;
import pl.edu.agh.softwarestudio.angel.AbstractListItem;
import pl.edu.agh.softwarestudio.angel.Location;
import reactor.core.publisher.Flux;

/**
 * Class that represents place where help is provided
 */
@Table("HelpPlace")
public class HelpPlace extends AbstractListItem {

    @Transient  /* Tells db that the field actually does not exist */
    private Flux<Location> loc;
    private boolean accepted;

    public static HelpPlace createHelpPlace(String name, String desc, int id){
        var hp = new HelpPlace();
        hp.id = id;
        hp.name = name;
        hp.description = desc;
        return hp;
    }
    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */
    @Override
    public String getDetailsUrl() {
        return "/api/details/places/"+this.id+"/";
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}
