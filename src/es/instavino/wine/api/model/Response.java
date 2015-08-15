package es.instavino.wine.api.model;

import java.io.File;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;

public class Response {

	@JsonProperty(value = "Status")
	private Status status;
	@JsonProperty(value = "Products")
	private Products products;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public static void main(String... args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Response r = objectMapper.readValue(new File("C:\\Users\\albertomv\\Dropbox\\Master\\Proyecto\\spain1.txt"),
				Response.class);
	}

}
