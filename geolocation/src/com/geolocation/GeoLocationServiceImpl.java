/**
 * 
 */
package com.abssoftware.geolocation;
/**
 * 
 * @author Abhijeet
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Abhijeet
 *
 */
@Service
public class GeoLocationServiceImpl implements GeoLocationService {

	@Autowired
	private GeoLocationRepository repository;
	
	/* (non-Javadoc)
	 * @see com.abssoftware.geolocation.GeoLocationService#create(com.abssoftware.geolocation.GeoLocation)
	 */
	@Override
	public GeoLocation create(GeoLocation geolocation) {
		// TODO Auto-generated method stub
		repository.setGeolocations(geolocation);
		return geolocation;
	}

	/* (non-Javadoc)
	 * @see com.abssoftware.geolocation.GeoLocationService#findAll()
	 */
	@Override
	public List<GeoLocation> findAll() {
		return repository.getGeolocations();
	}

}
