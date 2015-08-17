package es.instavino.wine.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Response {

    @JsonProperty(value = "Status")
    private Status status;

    @JsonProperty(value = "Products")
    private Products products;

    public Status getStatus() {
        return status;
    }

    public void setStatus(final Status status) {
        this.status = status;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(final Products products) {
        this.products = products;
    }

}
