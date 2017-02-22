package com.example.lenovo.srmcse_rmpcampus;

/**
 * Created by lenovo on 2/22/2017.
 */

public class Teacher {
    String name;
    String qualifications;
    String photo;
    String des;
    String spe;


    public Teacher(String name, String qualifications, String photo, String des, String spe) {
        this.name = name;
        this.qualifications = qualifications;
        this.photo = photo;
        this.des = des;
        this.spe = spe;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getSpe() {
        return spe;
    }

    public void setSpe(String spe) {
        this.spe = spe;
    }

    public Teacher(String name, String qualifications, String photo) {
        this.name = name;
        this.qualifications = qualifications;
        this.photo = photo;
    }

    public Teacher(String name, String qualifications) {
        this.name = name;
        this.qualifications = qualifications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
