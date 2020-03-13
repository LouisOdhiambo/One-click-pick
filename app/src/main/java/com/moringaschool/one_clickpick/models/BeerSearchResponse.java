
package com.moringaschool.one_clickpick;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BeerSearchResponse {

    @SerializedName("found")
    @Expose
    private Integer found;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("term")
    @Expose
    private String term;
    @SerializedName("parsed_term")
    @Expose
    private String parsedTerm;
    @SerializedName("beers")
    @Expose
    private Beers beers;
    @SerializedName("homebrew")
    @Expose
    private Homebrew homebrew;
    @SerializedName("breweries")
    @Expose
    private Breweries breweries;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BeerSearchResponse() {
    }

    /**
     * 
     * @param found
     * @param offset
     * @param beers
     * @param limit
     * @param parsedTerm
     * @param term
     * @param homebrew
     * @param breweries
     */
    public BeerSearchResponse(Integer found, Integer offset, Integer limit, String term, String parsedTerm, Beers beers, Homebrew homebrew, Breweries breweries) {
        super();
        this.found = found;
        this.offset = offset;
        this.limit = limit;
        this.term = term;
        this.parsedTerm = parsedTerm;
        this.beers = beers;
        this.homebrew = homebrew;
        this.breweries = breweries;
    }

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getParsedTerm() {
        return parsedTerm;
    }

    public void setParsedTerm(String parsedTerm) {
        this.parsedTerm = parsedTerm;
    }

    public Beers getBeers() {
        return beers;
    }

    public void setBeers(Beers beers) {
        this.beers = beers;
    }

    public Homebrew getHomebrew() {
        return homebrew;
    }

    public void setHomebrew(Homebrew homebrew) {
        this.homebrew = homebrew;
    }

    public Breweries getBreweries() {
        return breweries;
    }

    public void setBreweries(Breweries breweries) {
        this.breweries = breweries;
    }

}
