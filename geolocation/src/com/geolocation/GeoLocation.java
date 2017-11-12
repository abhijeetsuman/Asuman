package com.geolocation;
/**
 * 
 * @author Abhijeet
 *
 */
import java.io.Serializable;
import java.util.UUID;

public class GeoLocation implements Serializable {
  private static final long serialVersionUID = 1L;
  private double latitude;
  private double longitude;
  private UUID userId;
  private long timestamp;
/**
 * @return the latitude
 */
public double getLatitude() {
	return latitude;
}
/**
 * @param latitude the latitude to set
 */
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
/**
 * @return the longitude
 */
public double getLongitude() {
	return longitude;
}
/**
 * @param longitude the longitude to set
 */
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
/**
 * @return the userId
 */
public UUID getUserId() {
	return userId;
}
/**
 * @param userId the userId to set
 */
public void setUserId(UUID userId) {
	this.userId = userId;
}
/**
 * @return the timestamp
 */
public long getTimestamp() {
	return timestamp;
}
/**
 * @param timestamp the timestamp to set
 */
public void setTimestamp(long timestamp) {
	this.timestamp = timestamp;
}
/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}
  
}
