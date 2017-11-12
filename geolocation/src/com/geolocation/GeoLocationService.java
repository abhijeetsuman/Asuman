package com.abssoftware.geolocation;
/**
 * 
 * @author Abhijeet
 *
 */
import java.util.List;

public interface GeoLocationService {
  public GeoLocation create(GeoLocation geolocation);
  public List<GeoLocation> findAll();
}
