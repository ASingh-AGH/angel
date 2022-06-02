package pl.edu.agh.softwarestudio.angel.places;


import lombok.Data;
import pl.edu.agh.softwarestudio.angel.AbstractListItem;
import pl.edu.agh.softwarestudio.angel.location.Location;


import javax.persistence.*;

/**
 * Class that represents place where help is provided
 */
@Entity
@Data
@Table(name="HelpPlace")
public class HelpPlace extends AbstractListItem {

    @Id
    private Integer id;
//    @Transient  /* Tells db that the field actually does not exist */
    @OneToOne
    @JoinTable(
            name = "Locations",
            joinColumns = @JoinColumn(name = "locationId"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
//    @Transient
    private Location loc;
//    private Integer locationId;
    private boolean accepted;

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

//    public Integer getLocationId() {
//        return locationId;
//    }
//
//    public void setLocationId(Integer locationId) {
//        this.locationId = locationId;
//    }

    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */
    @Override
    public String getDetailsUrl() {
        return "/api/places/"+this.id+"/";
    }

}
