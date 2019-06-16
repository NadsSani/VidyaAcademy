package com.vidhya.vidyaacademy;

public class Approved_Adapter {

    private String name;
    private String userid;
    private String image;

    public Approved_Adapter(String name, String userid, String image) {
        this.name = name;
        this.userid = userid;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
