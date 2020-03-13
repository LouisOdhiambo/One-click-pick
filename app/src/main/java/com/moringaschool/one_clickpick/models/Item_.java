
package com.moringaschool.one_clickpick;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item_ {

    @SerializedName("brewery")
    @Expose
    private Brewery_ brewery;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item_() {
    }

    /**
     * 
     * @param brewery
     */
    public Item_(Brewery_ brewery) {
        super();
        this.brewery = brewery;
    }

    public Brewery_ getBrewery() {
        return brewery;
    }

    public void setBrewery(Brewery_ brewery) {
        this.brewery = brewery;
    }

}
