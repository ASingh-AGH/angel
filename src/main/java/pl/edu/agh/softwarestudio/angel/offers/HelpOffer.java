package pl.edu.agh.softwarestudio.angel.offers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.edu.agh.softwarestudio.angel.AbstractListItem;
import pl.edu.agh.softwarestudio.angel.location.Location;

import javax.persistence.*;

/**
 * Class that represents help offer
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="HelpOffer")
public class HelpOffer extends AbstractListItem {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "locationid", referencedColumnName = "id")
    private Location loc;

    private Long creatorUserId;

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
