/**
 * 
 */
package es.instavino.wine.api.model;
import java.util.List;

/**
 * @author albertomv
 *
 */
public class CommunityReviews {
	
	private Long HighestScore;
	private List<CommunityReview> List;
	private String Url;
	public Long getHighestScore() {
		return HighestScore;
	}
	public void setHighestScore(Long highestScore) {
		HighestScore = highestScore;
	}
	public List<CommunityReview> getList() {
		return List;
	}
	public void setList(List<CommunityReview> list) {
		List = list;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
	
	

}
