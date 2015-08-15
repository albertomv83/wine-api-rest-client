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
public class Ratings {
	
	
	@JsonProperty(value = "HighestScore")
	private Long highestScore;
	@JsonProperty(value = "List")
	private List<Rating> list;
	public Long getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(Long highestScore) {
		this.highestScore = highestScore;
	}
	public List<Rating> getList() {
		return list;
	}
	public void setList(List<Rating> list) {
		this.list = list;
	}
	
	

}
