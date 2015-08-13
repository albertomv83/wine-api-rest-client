/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Varietal {
	
	private Long Id;
	private String Name;
	private String Url;
	private WineType WineType;
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
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public WineType getWineType() {
		return WineType;
	}
	public void setWineType(WineType wineType) {
		WineType = wineType;
	}
	
	

}
