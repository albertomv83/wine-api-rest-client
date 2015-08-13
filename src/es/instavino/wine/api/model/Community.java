/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Community {
	
	private CommunityReviews Reviews;
	private String Url;
	public CommunityReviews getReviews() {
		return Reviews;
	}
	public void setReviews(CommunityReviews reviews) {
		Reviews = reviews;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
	

}
