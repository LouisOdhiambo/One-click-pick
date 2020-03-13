
package com.moringaschool.one_clickpick;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location_ {

    @SerializedName("brewery_city")
    @Expose
    private String breweryCity;
    @SerializedName("brewery_state")
    @Expose
    private String breweryState;
    @SerializedName("lat")
    @Expose
    private Integer lat;
    @SerializedName("lng")
    @Expose
    private Integer lng;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location_() {
    }

    /**
     * 
     * @param lng
     * @param breweryCity
     * @param breweryState
     * @param lat
     */
    public Location_(String breweryCity, String breweryState, Integer lat, Integer lng) {
        super();
        this.breweryCity = breweryCity;
        this.breweryState = breweryState;
        this.lat = lat;
        this.lng = lng;
    }

    public String getBreweryCity() {
        return breweryCity;
    }

    public void setBreweryCity(String breweryCity) {
        this.breweryCity = breweryCity;
    }

    public String getBreweryState() {
        return breweryState;
    }

    public void setBreweryState(String breweryState) {
        this.breweryState = breweryState;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Integer getLng() {
        return lng;
    }

    public void setLng(Integer lng) {
        this.lng = lng;
    }

}
