package com.abssoftware.geolocation;
/**
 * 
 * @author Abhijeet
 *
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abssoftware.geolocation.controller.GeoLocationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class GeoLocationAplication {

	@Autowired 
	public GeoLocationController geoLocation;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SpringApplication.run(GeoLocationAplication.class, args);
     
	}

}
