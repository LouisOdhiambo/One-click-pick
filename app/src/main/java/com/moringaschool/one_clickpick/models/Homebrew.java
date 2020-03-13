
package com.moringaschool.one_clickpick;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Homebrew {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("items")
    @Expose
    private List<Object> items = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Homebrew() {
    }

    /**
     * 
     * @param count
     * @param items
     */
    public Homebrew(Integer count, List<Object> items) {
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

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

}
