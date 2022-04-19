package project.softwarestudio.angel;


/**
 * Class that represents place where help is provided
 */
public class HelpPlace extends AbstractListItem {

    private Location loc;

    public static HelpPlace createHelpPlace(String name, String desc, int id){
        var hp = new HelpPlace();
        hp.id = id;
        hp.name = name;
        hp.desc = desc;
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
}
