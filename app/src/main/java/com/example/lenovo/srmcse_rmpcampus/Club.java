package com.example.lenovo.srmcse_rmpcampus;

/**
 * Created by lenovo on 3/3/2017.
 */

public class Club {
    String imageurl;
    String title;
    String description;
    String link;

    public Club(String imageurl, String title, String description, String link) {
        this.imageurl = imageurl;
        this.title = title;
        this.description = description;
        this.link = link;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
