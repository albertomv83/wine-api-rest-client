/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class GeoLocation {
	
	private Integer Latitude;
	private Integer Longitude;
	private String URL;
	public Integer getLatitude() {
		return Latitude;
	}
	public void setLatitude(Integer latitude) {
		Latitude = latitude;
	}
	public Integer getLongitude() {
		return Longitude;
	}
	public void setLongitude(Integer longitude) {
		Longitude = longitude;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	
	

}
