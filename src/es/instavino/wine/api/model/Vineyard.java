/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Vineyard {
	
	private Long Id;
	private String Name;
	private GeoLocation GeoLocation;
	private String Url;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public GeoLocation getGeoLocation() {
		return GeoLocation;
	}
	public void setGeoLocation(GeoLocation geoLocation) {
		GeoLocation = geoLocation;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
	

}
