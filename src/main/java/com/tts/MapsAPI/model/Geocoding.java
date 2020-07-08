package com.tts.MapsAPI.model;

public class Geocoding {
  private Geometry geometry;
  
  public Geocoding() {}

  public Geocoding(Geometry geometry) {
    this.geometry = geometry;
  }

  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }
  
}