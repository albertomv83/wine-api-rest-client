/**
 * 
 */
package es.instavino.wine.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author albertomv
 *
 */
public class Retail {
	

	@JsonProperty(value = "Sku")
	private String sku;
	@JsonProperty(value = "InStock")
	private Boolean inStock;
	@JsonProperty(value = "Price")
	private Float price;
	@JsonProperty(value = "Url")
	private String url;
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Boolean getInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
		

}
