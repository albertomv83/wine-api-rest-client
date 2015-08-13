/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Region {
	
	private Long Id;
	private String Name;
	private String Url;
	private Area Area;
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
	public Area getArea() {
		return Area;
	}
	public void setArea(Area area) {
		Area = area;
	}
	
	

}
