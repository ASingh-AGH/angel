package pl.edu.agh.softwarestudio.angel.location;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.awt.*;

/**
 * Class representing the location in DB
 */
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
    private float gooY;
    /**
     * Building number
     */
    private String building;
    /**
     * Apartment number
     */
    @Column("apartmentNumber")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public float getGeoX() {
        return geoX;
    }

    public void setGeoX(float geoX) {
        this.geoX = geoX;
    }

    public float getGooY() {
        return gooY;
    }

    public void setGooY(float gooY) {
        this.gooY = gooY;
    }
}
