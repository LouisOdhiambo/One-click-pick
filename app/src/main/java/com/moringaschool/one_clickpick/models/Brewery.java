
package com.moringaschool.one_clickpick;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Brewery {

    @SerializedName("brewery_id")
    @Expose
    private Integer breweryId;
    @SerializedName("brewery_name")
    @Expose
    private String breweryName;
    @SerializedName("brewery_slug")
    @Expose
    private String brewerySlug;
    @SerializedName("brewery_label")
    @Expose
    private String breweryLabel;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("contact")
    @Expose
    private Contact contact;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("brewery_active")
    @Expose
    private Integer breweryActive;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Brewery() {
    }

    /**
     * 
     * @param breweryId
     * @param contact
     * @param location
     * @param countryName
     * @param breweryLabel
     * @param breweryName
     * @param breweryActive
     * @param brewerySlug
     */
    public Brewery(Integer breweryId, String breweryName, String brewerySlug, String breweryLabel, String countryName, Contact contact, Location location, Integer breweryActive) {
        super();
        this.breweryId = breweryId;
        this.breweryName = breweryName;
        this.brewerySlug = brewerySlug;
        this.breweryLabel = breweryLabel;
        this.countryName = countryName;
        this.contact = contact;
        this.location = location;
        this.breweryActive = breweryActive;
    }

    public Integer getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(Integer breweryId) {
        this.breweryId = breweryId;
    }

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }

    public String getBrewerySlug() {
        return brewerySlug;
    }

    public void setBrewerySlug(String brewerySlug) {
        this.brewerySlug = brewerySlug;
    }

    public String getBreweryLabel() {
        return breweryLabel;
    }

    public void setBreweryLabel(String breweryLabel) {
        this.breweryLabel = breweryLabel;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getBreweryActive() {
        return breweryActive;
    }

    public void setBreweryActive(Integer breweryActive) {
        this.breweryActive = breweryActive;
    }

}
