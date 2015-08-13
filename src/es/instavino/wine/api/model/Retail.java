/**
 * 
 */
package es.instavino.wine.api.model;

/**
 * @author albertomv
 *
 */
public class Retail {
	
	private String Sku;
	private Boolean InStock;
	private Float Price;
	private String Url;
	public String getSku() {
		return Sku;
	}
	public void setSku(String sku) {
		Sku = sku;
	}
	public Boolean getInStock() {
		return InStock;
	}
	public void setInStock(Boolean inStock) {
		InStock = inStock;
	}
	public Float getPrice() {
		return Price;
	}
	public void setPrice(Float price) {
		Price = price;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
	
	

}
