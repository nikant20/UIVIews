package com.wordpress.nikant20.uiviews;

/**
 * Created by nikant on 7/12/2017.
 */

public class User {

    int icon;
    String name;
    String phone;

    public User(){

    }

    public User(int icon, String name, String phone) {
        this.icon = icon;
        this.name = name;
        this.phone = phone;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
