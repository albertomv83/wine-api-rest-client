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

    /**
     * @return Returns the id.
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            The id to set.
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            The name to set.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return Returns the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            The description to set.
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @return Returns the geoLocation.
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * @param geoLocation
     *            The geoLocation to set.
     */
    public void setGeoLocation(final GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    /**
     * @return Returns the url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     *            The url to set.
     */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
     * @return Returns the priceMin.
     */
    public Float getPriceMin() {
        return priceMin;
    }

    /**
     * @param priceMin
     *            The priceMin to set.
     */
    public void setPriceMin(final Float priceMin) {
        this.priceMin = priceMin;
    }

    /**
     * @return Returns the priceMax.
     */
    public Float getPriceMax() {
        return priceMax;
    }

    /**
     * @param priceMax
     *            The priceMax to set.
     */
    public void setPriceMax(final Float priceMax) {
        this.priceMax = priceMax;
    }

    /**
     * @return Returns the priceRetail.
     */
    public Float getPriceRetail() {
        return priceRetail;
    }

    /**
     * @param priceRetail
     *            The priceRetail to set.
     */
    public void setPriceRetail(final Float priceRetail) {
        this.priceRetail = priceRetail;
    }

    /**
     * @return Returns the type.
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            The type to set.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * @return Returns the year.
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year
     *            The year to set.
     */
    public void setYear(final String year) {
        this.year = year;
    }

    /**
     * @return Returns the appellation.
     */
    public Appelation getAppellation() {
        return appellation;
    }

    /**
     * @param appellation
     *            The appellation to set.
     */
    public void setAppellation(final Appelation appellation) {
        this.appellation = appellation;
    }

    /**
     * @return Returns the varietal.
     */
    public Varietal getVarietal() {
        return varietal;
    }

    /**
     * @param varietal
     *            The varietal to set.
     */
    public void setVarietal(final Varietal varietal) {
        this.varietal = varietal;
    }

    /**
     * @return Returns the vineyard.
     */
    public Vineyard getVineyard() {
        return vineyard;
    }

    /**
     * @param vineyard
     *            The vineyard to set.
     */
    public void setVineyard(final Vineyard vineyard) {
        this.vineyard = vineyard;
    }

    /**
     * @return Returns the productAttributes.
     */
    public List<ProductAttribute> getProductAttributes() {
        return productAttributes;
    }

    /**
     * @param productAttributes
     *            The productAttributes to set.
     */
    public void setProductAttributes(
            final List<ProductAttribute> productAttributes) {
        this.productAttributes = productAttributes;
    }

    /**
     * @return Returns the labels.
     */
    public List<Label> getLabels() {
        return labels;
    }

    /**
     * @param labels
     *            The labels to set.
     */
    public void setLabels(final List<Label> labels) {
        this.labels = labels;
    }

    /**
     * @return Returns the ratings.
     */
    public Ratings getRatings() {
        return ratings;
    }

    /**
     * @param ratings
     *            The ratings to set.
     */
    public void setRatings(final Ratings ratings) {
        this.ratings = ratings;
    }

    /**
     * @return Returns the retail.
     */
    public Retail getRetail() {
        return retail;
    }

    /**
     * @param retail
     *            The retail to set.
     */
    public void setRetail(final Retail retail) {
        this.retail = retail;
    }

    /**
     * @return Returns the vintage.
     */
    public String getVintage() {
        return vintage;
    }

    /**
     * @param vintage
     *            The vintage to set.
     */
    public void setVintage(final String vintage) {
        this.vintage = vintage;
    }

    /**
     * @return Returns the vintages.
     */
    public Vintages getVintages() {
        return vintages;
    }

    /**
     * @param vintages
     *            The vintages to set.
     */
    public void setVintages(final Vintages vintages) {
        this.vintages = vintages;
    }

    /**
     * @return Returns the community.
     */
    public Community getCommunity() {
        return community;
    }

    /**
     * @param community
     *            The community to set.
     */
    public void setCommunity(final Community community) {
        this.community = community;
    }

}
