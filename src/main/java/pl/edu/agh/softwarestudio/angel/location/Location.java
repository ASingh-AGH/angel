package pl.edu.agh.softwarestudio.angel.location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.awt.*;

/**
 * Class representing the location in DB
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "location")
public class Location {
    /**
     * Location id
     */
    @Id
    @SequenceGenerator(name="helpplace_id_seq",
            sequenceName="helpplace_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="helpplace_id_seq")
    @Column(name = "id", updatable=false)
    private Integer id;
    /**
     * Geography localisation on the map
     */
    @Column(name = "geox")
    private float geoX;
    /**
     * Geography localisation on the map
     */
    @Column(name = "geoy")
    private float geoY;
    /**
     * Building number
     */
    @Column(name="building")
    private String building;
    /**
     * Apartment number
     */
    @Column(name="apartmentnumber")
    private String apartmentNumber;
    /**
     * Street name
     */
    @Column(name = "street")
    private String street;
    /**
     * City name
     */
    @Column(name = "city")
    private String city;
    /**
     * Zip code
     */
    @Column(name = "zip")
    private String zip;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
