/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Apellation {
	
	private Long ID;
	private String Name;
	private String URL;
	private Region Region;
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public Region getRegion() {
		return Region;
	}
	public void setRegion(Region region) {
		Region = region;
	}
	
	
	

}
