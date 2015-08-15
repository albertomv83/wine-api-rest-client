package es.instavino.wine.api.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Product {

	@JsonProperty(value = "Id")
	private Long id;
	@JsonProperty(value = "Name")
	private String name;
	@JsonProperty(value = "Description")
	private String description;
	@JsonProperty(value = "GeoLocation")
	private GeoLocation geoLocation;
	@JsonProperty(value = "Url")
	private String url;
	@JsonProperty(value = "PriceMin")
	private Float priceMin;
	@JsonProperty(value = "PriceMax")
	private Float priceMax;
	@JsonProperty(value = "PriceRetail")
	private Float priceRetail;
	@JsonProperty(value = "Type")
	private String type;
	@JsonProperty(value = "Year")
	private String year;
	@JsonProperty(value = "Appellation")
	private Appelation appellation;
	@JsonProperty(value = "Varietal")
	private Varietal varietal;
	@JsonProperty(value = "Vineyard")
	private Vineyard vineyard;
	@JsonProperty(value = "ProductAttributes")
	private List<ProductAttribute> productAttributes;
	@JsonProperty(value = "Labels")
	private List<Label> labels;
	@JsonProperty(value = "Ratings")
	private Ratings ratings;
	@JsonProperty(value = "Retail")
	private Retail retail;
	@JsonProperty(value = "Vintage")
	private String vintage;
	@JsonProperty(value = "Vintages")
	private Vintages vintages;
	@JsonProperty(value = "Community")
	private Community community;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Float getPriceMin() {
		return priceMin;
	}
	public void setPriceMin(Float priceMin) {
		this.priceMin = priceMin;
	}
	public Float getPriceMax() {
		return priceMax;
	}
	public void setPriceMax(Float priceMax) {
		this.priceMax = priceMax;
	}
	public Float getPriceRetail() {
		return priceRetail;
	}
	public void setPriceRetail(Float priceRetail) {
		this.priceRetail = priceRetail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Appelation getApellation() {
		return appellation;
	}
	public void setApellation(Appelation apellation) {
		this.appellation = apellation;
	}
	public Varietal getVarietal() {
		return varietal;
	}
	public void setVarietal(Varietal varietal) {
		this.varietal = varietal;
	}
	public Vineyard getVineyard() {
		return vineyard;
	}
	public void setVineyard(Vineyard vineyard) {
		this.vineyard = vineyard;
	}
	public List<ProductAttribute> getProductAttributes() {
		return productAttributes;
	}
	public void setProductAttributes(List<ProductAttribute> productAttributes) {
		this.productAttributes = productAttributes;
	}
	public List<Label> getLabels() {
		return labels;
	}
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	public Ratings getRatings() {
		return ratings;
	}
	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}
	public Retail getRetail() {
		return retail;
	}
	public void setRetail(Retail retail) {
		this.retail = retail;
	}
	public Vintages getVintages() {
		return vintages;
	}
	public void setVintages(Vintages vintages) {
		this.vintages = vintages;
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public Appelation getAppelation() {
		return appellation;
	}
	public void setAppelation(Appelation appelation) {
		this.appellation = appelation;
	}
	public String getVintage() {
		return vintage;
	}
	public void setVintage(String vintage) {
		this.vintage = vintage;
	}
	
	
	
	
	
	}
