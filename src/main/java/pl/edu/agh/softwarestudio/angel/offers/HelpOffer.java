package pl.edu.agh.softwarestudio.angel.offers;

import pl.edu.agh.softwarestudio.angel.AbstractListItem;
import pl.edu.agh.softwarestudio.angel.Location;

/**
 * Class that represents help offer
 */
public class HelpOffer extends AbstractListItem {

    private Location loc;

    private Integer creatorUserId;

    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }



    public static HelpOffer createHelpPlace(String name, String desc, int id){
        var ho = new HelpOffer();
        ho.id = id;
        ho.name = name;
        ho.description = desc;
        return ho;
    }

    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */
    @Override
    public String getDetailsUrl() {
        return "/api/details/offers/"+this.id+"/";
    }
}
