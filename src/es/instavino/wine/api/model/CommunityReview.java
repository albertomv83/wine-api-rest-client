/**
 * 
 */
package es.instavino.wine.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author albertomv
 *
 */
public class CommunityReview {
	
	@JsonProperty(value = "Id")
	private Long id;
	@JsonProperty(value = "Name")
	private String name;
	@JsonProperty(value = "Score")
	private Long ccore;
	@JsonProperty(value = "Description")
	private String description;
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
	public Long getCcore() {
		return ccore;
	}
	public void setCcore(Long ccore) {
		this.ccore = ccore;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	

}
