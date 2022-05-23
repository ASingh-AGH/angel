package pl.edu.agh.softwarestudio.angel;

import org.springframework.data.annotation.Id;

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
    protected String description;
    /**
     * Id of item
     */
    @Id
    protected Integer id;

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
     * @param description Description
     */
    public void setDescription(String description){
        this.description = description; // strings are immutable so no cloning is needed
    }

    /**
     * Getter of description
     * @return Description of item
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Getter of Id
     * @return Id of item
     */
    public Integer getId(){
        return this.id;
    }

    /**
     * Setter of Id
     * @param id Id of item
     */
    public void setId(Integer id){
        this.id = id;
    }
}
