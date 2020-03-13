
package com.moringaschool.one_clickpick;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Brewery_ {

    @SerializedName("brewery_id")
    @Expose
    private Integer breweryId;
    @SerializedName("beer_count")
    @Expose
    private Integer beerCount;
    @SerializedName("brewery_name")
    @Expose
    private String breweryName;
    @SerializedName("brewery_label")
    @Expose
    private String breweryLabel;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("location")
    @Expose
    private Location_ location;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Brewery_() {
    }

    /**
     * 
     * @param beerCount
     * @param breweryId
     * @param location
     * @param countryName
     * @param breweryLabel
     * @param breweryName
     */
    public Brewery_(Integer breweryId, Integer beerCount, String breweryName, String breweryLabel, String countryName, Location_ location) {
        super();
        this.breweryId = breweryId;
        this.beerCount = beerCount;
        this.breweryName = breweryName;
        this.breweryLabel = breweryLabel;
        this.countryName = countryName;
        this.location = location;
    }

    public Integer getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(Integer breweryId) {
        this.breweryId = breweryId;
    }

    public Integer getBeerCount() {
        return beerCount;
    }

    public void setBeerCount(Integer beerCount) {
        this.beerCount = beerCount;
    }

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
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

    public Location_ getLocation() {
        return location;
    }

    public void setLocation(Location_ location) {
        this.location = location;
    }

}
