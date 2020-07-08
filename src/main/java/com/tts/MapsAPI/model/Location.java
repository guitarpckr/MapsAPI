package com.tts.MapsAPI.model;

public class Location {
  private String city;
  private String state;
  private String lat;
  private String lng;
  
  public Location() {}

  public Location(String city, String state, String lat,
      String lng) {
    this.city = city;
    this.state = state;
    this.lat = lat;
    this.lng = lng;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLng() {
    return lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }
  
  
}
