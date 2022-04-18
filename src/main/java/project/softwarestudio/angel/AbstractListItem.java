package project.softwarestudio.angel;

/**
 * Class representing the item that can be listed within app
 */
public abstract class AbstractListItem {
    /**
     * Name of the item
     */
    protected String name;
    /**
     * Description of item
     */
    protected String desc;
    /**
     * Id of item
     */
    protected int id;

    /**
     * Function that returns the url to page with details
     * @return The url where user should go to see the details
     */
    public abstract String getDetailsUrl();

    /**
     * Function that sets the name for item
     * @param name  Name
     */
    public void setName(String name){
        this.name = name;   // strings are immutable so no cloning is needed
    }

    /**
     * Getter of name
     * @return  Name of item
     */
    public String getName(){
        return this.name;
    }

    /**
     * Function that sets the description for item
     * @param desc Description
     */
    public void setDesc(String desc){
        this.desc = desc; // strings are immutable so no cloning is needed
    }

    /**
     * Getter of description
     * @return Description of item
     */
    public String getDesc(){
        return this.desc;
    }
}
