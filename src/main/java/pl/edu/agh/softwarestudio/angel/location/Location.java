package pl.edu.agh.softwarestudio.angel.location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;

/**
 * Class representing the location in DB
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Location")
public class Location {
    /**
     * Location id
     */
    @Id
    private Integer id;
    /**
     * Geography localisation on the map
     */
    private float geoX;
    /**
     * Geography localisation on the map
     */
    private float geoY;
    /**
     * Building number
     */
    private String building;
    /**
     * Apartment number
     */
    private String apartmentNumber;
    /**
     * Street name
     */
    private String street;
    /**
     * City name
     */
    private String city;
    /**
     * Zip code
     */
    private String zip;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
