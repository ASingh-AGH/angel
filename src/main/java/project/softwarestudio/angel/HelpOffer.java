package project.softwarestudio.angel;

/**
 * Class that represents help offer
 */
public class HelpOffer extends AbstractListItem {

    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */
    @Override
    public String getDetailsUrl() {
        return "/api/details/offers/{"+this.id+"}/";
    }
}
