
package com.moringaschool.one_clickpick.models;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("path")
    @Expose
    private List<Path> path = null;
    @SerializedName("subCategories")
    @Expose
    private List<SubCategory> subCategories = null;
    public final static Parcelable.Creator<Category> CREATOR = new Creator<Category>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Category createFromParcel(Parcel in) {
            return new Category(in);
        }

        public Category[] newArray(int size) {
            return (new Category[size]);
        }

    }
    ;
    private final static long serialVersionUID = -8799809844749921407L;

    protected Category(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.active = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.path, (com.moringaschool.one_clickpick.models.Path.class.getClassLoader()));
        in.readList(this.subCategories, (com.moringaschool.one_clickpick.models.SubCategory.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param path
     * @param name
     * @param active
     * @param id
     * @param url
     * @param subCategories
     */
    public Category(String id, String name, Boolean active, String url, List<Path> path, List<SubCategory> subCategories) {
        super();
        this.id = id;
        this.name = name;
        this.active = active;
        this.url = url;
        this.path = path;
        this.subCategories = subCategories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Path> getPath() {
        return path;
    }

    public void setPath(List<Path> path) {
        this.path = path;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(active);
        dest.writeValue(url);
        dest.writeList(path);
        dest.writeList(subCategories);
    }

    public int describeContents() {
        return  0;
    }

}
