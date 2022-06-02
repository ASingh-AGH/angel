package pl.edu.agh.softwarestudio.angel.places;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.edu.agh.softwarestudio.angel.AbstractListItem;
import pl.edu.agh.softwarestudio.angel.location.Location;


import javax.persistence.*;

/**
 * Class that represents place where help is provided
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Cacheable(false)
@Table(name="helpplace")
public class HelpPlace {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
//    @Transient  /* Tells db that the field actually does not exist */
    @OneToOne
    @JoinColumn(name = "locationid", referencedColumnName = "id")
//    @Transient
    private Location loc;
//    @Column(name = "locationid")
//    private Integer locationId;
    private boolean accepted;

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

//    public Location getLoc() {
//        return loc;
//    }
//
//    public void setLoc(Location loc) {
//        this.loc = loc;
//    }

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

    public String getDetailsUrl() {
        return "/api/places/"+this.id+"/";
    }

}
