package pl.edu.agh.softwarestudio.angel.location;

import lombok.Data;
import org.springframework.data.annotation.Id;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.awt.*;

/**
 * Class representing the location in DB
 */
@Entity
@Data
@Table(name="Location")
public class Location {
    /**
     * Location id
     */
    @Id
    private int id;
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


}
