package week1;

import java.lang.Math;

public class SimpleLocation {
	
	double longitude;
	double latitude;
	
	public SimpleLocation() {
		this.latitude = 12.34;
		this.longitude = 34.56;
	}
	
	public SimpleLocation(double lng, double lat){
		this.longitude = lng;
		this.latitude = lat;
	}
	
	
	/**
	 * get distance between 2 points. The earth is flat.
	 * @param {week1.SimpleLocation} other 
	 * @return {double} distance
	 */
	public double getDistance(SimpleLocation other){
		
		double lat = Math.pow(other.latitude - this.latitude, 2);
		double lng = Math.pow(other.longitude - this.longitude, 2);
		
		return Math.sqrt(lat + lng);
	}
	
	
	@Override
	public String toString() {
		String template = "latitude: %s; longitude: %s";
		return String.format(template, this.latitude, this.longitude);
	}
	
}
