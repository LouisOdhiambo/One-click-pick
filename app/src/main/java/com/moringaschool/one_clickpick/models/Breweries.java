
package com.moringaschool.one_clickpick;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Breweries {

    @SerializedName("items")
    @Expose
    private List<Item_> items = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Breweries() {
    }

    /**
     * 
     * @param count
     * @param items
     */
    public Breweries(List<Item_> items, Integer count) {
        super();
        this.items = items;
        this.count = count;
    }

    public List<Item_> getItems() {
        return items;
    }

    public void setItems(List<Item_> items) {
        this.items = items;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
