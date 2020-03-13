
package com.moringaschool.one_clickpick;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Beers {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Beers() {
    }

    /**
     * 
     * @param count
     * @param items
     */
    public Beers(Integer count, List<Item> items) {
        super();
        this.count = count;
        this.items = items;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
