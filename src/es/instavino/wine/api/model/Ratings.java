/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Ratings {
	
	
	private Long Id;
	private String Name;
	private Long Score;
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
	public Long getScore() {
		return Score;
	}
	public void setScore(Long score) {
		Score = score;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
	

}
