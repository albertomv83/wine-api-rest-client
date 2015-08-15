package es.instavino.wine.api.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Products {


	@JsonProperty(value = "Total")
	private Integer total;
	@JsonProperty(value = "Offset")
	private Integer offset;
	@JsonProperty(value = "Url")
	private String url;
	@JsonProperty(value = "List")
	private List<Product> list;
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<Product> getList() {
		return list;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}
	
	
	
}
