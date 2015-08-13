package es.instavino.wine.api.model;

import java.util.List;

public class Product {

	private Long Id;
	private String Name;
	private String Description;
	private GeoLocation GeoLocation;
	private String Url;
	private Float PriceMin;
	private Float PriceMax;
	private Float PriceRetail;
	private String Type;
	private String Year;
	private Apellation Apellation;
	private Varietal Varietal;
	private Vineyard Vineyard;
	private List<ProductAttribute> ProductAttributes;
	private List<Label> Labels;
	private Ratings Ratings;
	private Retail Retail;
	private Vintages Vintages;
	private Community Community;
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
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public GeoLocation getGeoLocation() {
		return GeoLocation;
	}
	public void setGeoLocation(GeoLocation geoLocation) {
		GeoLocation = geoLocation;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public Float getPriceMin() {
		return PriceMin;
	}
	public void setPriceMin(Float priceMin) {
		PriceMin = priceMin;
	}
	public Float getPriceMax() {
		return PriceMax;
	}
	public void setPriceMax(Float priceMax) {
		PriceMax = priceMax;
	}
	public Float getPriceRetail() {
		return PriceRetail;
	}
	public void setPriceRetail(Float priceRetail) {
		PriceRetail = priceRetail;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public Apellation getApellation() {
		return Apellation;
	}
	public void setApellation(Apellation apellation) {
		Apellation = apellation;
	}
	public Varietal getVarietal() {
		return Varietal;
	}
	public void setVarietal(Varietal varietal) {
		Varietal = varietal;
	}
	public Vineyard getVineyard() {
		return Vineyard;
	}
	public void setVineyard(Vineyard vineyard) {
		Vineyard = vineyard;
	}
	public List<ProductAttribute> getProductAttributes() {
		return ProductAttributes;
	}
	public void setProductAttributes(List<ProductAttribute> productAttributes) {
		ProductAttributes = productAttributes;
	}
	public List<Label> getLabels() {
		return Labels;
	}
	public void setLabels(List<Label> labels) {
		Labels = labels;
	}
	public Ratings getRatings() {
		return Ratings;
	}
	public void setRatings(Ratings ratings) {
		Ratings = ratings;
	}
	public Retail getRetail() {
		return Retail;
	}
	public void setRetail(Retail retail) {
		Retail = retail;
	}
	public Vintages getVintages() {
		return Vintages;
	}
	public void setVintages(Vintages vintages) {
		Vintages = vintages;
	}
	public Community getCommunity() {
		return Community;
	}
	public void setCommunity(Community community) {
		Community = community;
	}
	
	
	
}
