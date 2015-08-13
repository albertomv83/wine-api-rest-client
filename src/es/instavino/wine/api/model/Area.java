/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Area {
	
	private Long Id;
	private String Name;
	private String Url;
	private Area Parent;
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
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public Area getParent() {
		return Parent;
	}
	public void setParent(Area parent) {
		Parent = parent;
	}
	
	
	

}
