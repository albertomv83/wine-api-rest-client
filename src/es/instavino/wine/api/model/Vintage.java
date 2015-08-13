/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Vintage {
	
	private Long Id;
	private String Name;
	private Ratings Ratings;
	private String Url;
	
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
	public Ratings getRatings() {
		return Ratings;
	}
	public void setRatings(Ratings ratings) {
		Ratings = ratings;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
	

}
