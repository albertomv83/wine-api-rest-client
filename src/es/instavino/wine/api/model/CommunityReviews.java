/**
 * 
 */
package es.instavino.wine.api.model;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author albertomv
 *
 */
public class CommunityReviews {
	
	@JsonProperty(value = "HighestScore")
	private Long highestScore;
	@JsonProperty(value = "List")
	private List<CommunityReview> list;
	@JsonProperty(value = "Url")
	private String url;
	
	public Long getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(Long highestScore) {
		this.highestScore = highestScore;
	}
	public List<CommunityReview> getList() {
		return list;
	}
	public void setList(List<CommunityReview> list) {
		this.list = list;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
		
	

}
