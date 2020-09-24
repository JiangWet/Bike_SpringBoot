package bike.example.demo.service;

import java.util.List;

import org.springframework.data.geo.GeoResult;

import bike.example.demo.pojo.Bike;



public interface BikeService {

	public void save(Bike bike);

	public List<GeoResult<Bike>> findNear(double longitude, double latitude);
	
	
	

}
