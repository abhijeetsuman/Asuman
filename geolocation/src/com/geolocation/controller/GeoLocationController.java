package com.abssoftware.geolocation.controller;
/**
 * 
 * @author Abhijeet
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abssoftware.geolocation.GeoLocation;
import com.abssoftware.geolocation.GeoLocationService;

@RestController
@RequestMapping( path = "/geolocation")

public class GeoLocationController {
   
	@Autowired
	private GeoLocationService service;
	
	@RequestMapping(method = RequestMethod.POST )
	public GeoLocation create(GeoLocation geolocation){
		return service.create(geolocation);
	}
	

	@RequestMapping(method = RequestMethod.GET )
	public List<GeoLocation> findAll() {
		return service.findAll();
	}
}
