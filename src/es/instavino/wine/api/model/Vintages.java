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
public class Vintages {
	
	@JsonProperty(value = "List")
	private List<Vintage> list;

	public List<Vintage> getList() {
		return list;
	}

	public void setList(List<Vintage> list) {
		this.list = list;
	}
	
	

}
