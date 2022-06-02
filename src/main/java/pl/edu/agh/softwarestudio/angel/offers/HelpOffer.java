package pl.edu.agh.softwarestudio.angel.offers;

import lombok.Data;
import pl.edu.agh.softwarestudio.angel.AbstractListItem;
import pl.edu.agh.softwarestudio.angel.location.Location;

import javax.persistence.*;

/**
 * Class that represents help offer
 */
@Entity
@Data
@Table(name="HelpOffer")
public class HelpOffer extends AbstractListItem {
    @Id
    private Integer id;
    @OneToOne
    @JoinTable(
            name = "Locations",
            joinColumns = @JoinColumn(name = "locationId"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private Location loc;

    private Integer creatorUserId;

    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */
    @Override
    public String getDetailsUrl() {
        return "/api/offer/"+this.id+"/";
    }
}
