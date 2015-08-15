/**
 * 
 */
package es.instavino.wine.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author albertomv
 *
 */
public class Vintage {
	
	@JsonProperty(value = "Id")
	private Long id;
	@JsonProperty(value = "Name")
	private String name;
	@JsonProperty(value = "Ratings")
	private Ratings ratings;
	@JsonProperty(value = "Url")
	private String url;
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
	public Ratings getRatings() {
		return ratings;
	}
	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	

}
