package pl.edu.agh.softwarestudio.angel.places;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.edu.agh.softwarestudio.angel.categories.Category;
import pl.edu.agh.softwarestudio.angel.location.Location;
import pl.edu.agh.softwarestudio.angel.utils.Image;


import javax.persistence.*;
import java.util.List;

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
    @SequenceGenerator(name="helpplace_id_seq",
            sequenceName="helpplace_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="helpplace_id_seq")
    @Column(name = "id", updatable=false)
    private Integer id;
    private String name;
    private String description;
    @Column(name = "openhours")
    private String openHours;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "locationid", referencedColumnName = "id")
    private Location loc;
    private boolean accepted;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name = "placecategory",
            joinColumns = @JoinColumn(name = "placeid"),
            inverseJoinColumns = @JoinColumn(name = "catid"))
    private List<Category> categories;

    @ManyToMany(cascade=CascadeType.ALL) //cascade=CascadeType.ALL allows insertion by single json object
    @JoinTable(
            name = "helpplaceimages",
            joinColumns = @JoinColumn(name = "helpplaceid"),
            inverseJoinColumns = @JoinColumn(name = "imageid"))
    private List<Image> imgs;

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }


    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */

    public String getDetailsUrl() {
        return "/api/places/"+this.id+"/";
    }


}
