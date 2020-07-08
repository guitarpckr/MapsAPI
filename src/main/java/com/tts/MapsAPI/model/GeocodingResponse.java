package com.tts.MapsAPI.model;

import java.util.List;

public class GeocodingResponse {
  private List<Geocoding> results;
  
  public GeocodingResponse() {}

  public GeocodingResponse(List<Geocoding> results) {
    this.results = results;
  }

  public List<Geocoding> getResults() {
    return results;
  }

  public void setResults(List<Geocoding> results) {
    this.results = results;
  }
  
}