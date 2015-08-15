/**
 * 
 */
package es.instavino.wine.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author albertomv
 *
 */
public class Region {
	
	@JsonProperty(value = "Id")
	private Long id;
	@JsonProperty(value = "Name")
	private String name;
	@JsonProperty(value = "Url")
	private String ul;
	@JsonProperty(value = "Area")
	private Area area;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUl() {
		return ul;
	}
	public void setUl(String ul) {
		this.ul = ul;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	
	

}
