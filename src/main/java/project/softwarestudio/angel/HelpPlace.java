package project.softwarestudio.angel;


/**
 * Class that represents place where help is provided
 */
public class HelpPlace extends AbstractListItem {

    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */
    @Override
    public String getDetailsUrl() {
        return "/api/details/places/{"+this.id+"}/";
    }
}
