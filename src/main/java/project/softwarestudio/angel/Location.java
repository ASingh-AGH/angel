package project.softwarestudio.angel;

import org.springframework.data.annotation.Id;

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
    private Point geo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getGeo() {
        return geo;
    }

    public void setGeo(Point geo) {
        this.geo = geo;
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
}
