package pl.edu.agh.softwarestudio.angel.offers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.edu.agh.softwarestudio.angel.categories.Category;
import pl.edu.agh.softwarestudio.angel.location.Location;

import javax.persistence.*;
import java.util.List;

/**
 * Class that represents help offer
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="helpoffer")
public class HelpOffer {
    @Id
    @SequenceGenerator(name="helpoffer_id_seq",
            sequenceName="helpoffer_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="helpoffer_id_seq")
    @Column(name = "id", updatable=false)
    private Integer id;
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

//    private Long creatorUserId;

    /**
     * Function that returns the url to page with details
     *
     * @return The url where user should go to see the details
     */
    public String getDetailsUrl() {
        return "/api/offer/"+this.id+"/";
    }
}
