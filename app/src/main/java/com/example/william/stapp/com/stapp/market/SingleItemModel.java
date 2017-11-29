package com.example.william.stapp.com.stapp.market;

/**
 * Created by jason on 04/07/2017.
 */

public class SingleItemModel {
    private String name;
    private String url;
    private String description; //// TODO: 04/07/2017 add string

    public SingleItemModel(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
