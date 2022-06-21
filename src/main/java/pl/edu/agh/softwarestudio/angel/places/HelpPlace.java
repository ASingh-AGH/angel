package pl.edu.agh.softwarestudio.angel.places;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.edu.agh.softwarestudio.angel.categories.Category;
import pl.edu.agh.softwarestudio.angel.location.Location;


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
    private Long id;
    private String name;
    private String description;

    @OneToOne
    @JoinColumn(name = "locationid", referencedColumnName = "id")
    private Location loc;
    private boolean accepted;
    @ManyToMany
    @JoinTable(
            name = "placecategory",
            joinColumns = @JoinColumn(name = "placeid"),
            inverseJoinColumns = @JoinColumn(name = "catid"))
    private List<Category> categories;

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
