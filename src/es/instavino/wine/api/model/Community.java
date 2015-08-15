/**
 * 
 */
package es.instavino.wine.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author albertomv
 *
 */
public class Community {
	
	@JsonProperty(value = "Reviews")
	private CommunityReviews reviews;
	@JsonProperty(value = "Url")
	private String url;
	
	public CommunityReviews getReviews() {
		return reviews;
	}
	public void setReviews(CommunityReviews reviews) {
		this.reviews = reviews;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	

}
