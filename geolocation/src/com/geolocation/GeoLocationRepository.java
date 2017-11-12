package com.abssoftware.geolocation;
/**
 * 
 * @author Abhijeet
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class GeoLocationRepository {
  private List<GeoLocation> geolocations = new ArrayList<GeoLocation>();

/**
 * @return the geolocations
 */
public List<GeoLocation> getGeolocations() {
	return geolocations;
}

/**
 * @param geolocations the geolocations to set
 */
public void setGeolocations(GeoLocation geolocation) {
	this.geolocations.add(geolocation);
}
  
}
