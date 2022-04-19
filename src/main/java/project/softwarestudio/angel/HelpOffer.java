package project.softwarestudio.angel;

/**
 * Class that represents help offer
 */
public class HelpOffer extends AbstractListItem {

    public static HelpOffer createHelpPlace(String name, String desc, int id){
        var ho = new HelpOffer();
        ho.id = id;
        ho.name = name;
        ho.desc = desc;
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
