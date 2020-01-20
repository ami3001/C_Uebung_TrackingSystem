package com.example.c_uebung_trackingsystem;

public class Data {

    public double longitude;
    public double latitude;
    public String myDate;
    public String time;

    public Data(double longitude, double latitude, String myDate, String time) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.myDate = myDate;
        this.time = time;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getMyDate() {
        return myDate;
    }

    public void setMyDate(String myDate) {
        this.myDate = myDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Data{" +
                "longitude=" + longitude + '\'' +
                "latitude=" + latitude + '\''+
                "myDate='" + myDate + "    "+time+'}';
    }
}
