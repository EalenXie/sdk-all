package io.github.ealenxie.wish.price;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:17
 * @version 1.0
 */
@Getter
@Setter
public class ShippingOptionQueryParams {

    /**
     * daysToDeliverMax
     */
    @JsonProperty("days_to_deliver_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String daysToDeliverMax;
    /**
     * dimensionUnit
     */
    @JsonProperty("dimension_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dimensionUnit;
    /**
     * orderId
     */
    @JsonProperty("order_id")
    private String orderId;
    /**
     * originCity
     */
    @JsonProperty("origin_city")
    private String originCity;
    /**
     * originCountry
     */
    @JsonProperty("origin_country")
    private String originCountry;
    /**
     * originRegionCode
     */
    @JsonProperty("origin_region_code")
    private String originRegionCode;
    /**
     * originStreetAddressOne
     */
    @JsonProperty("origin_street_address1")
    private String originStreetAddressOne;
    /**
     * originStreetAddressTwo
     */
    @JsonProperty("origin_street_address2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String originStreetAddressTwo;
    /**
     * originStreetAddressThree
     */
    @JsonProperty("origin_street_address3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String originStreetAddressThree;
    /**
     * originZipcode
     */
    @JsonProperty("origin_zipcode")
    private String originZipcode;
    /**
     * packageHeight
     */
    @JsonProperty("package_height")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String packageHeight;
    /**
     * packageLength
     */
    @JsonProperty("package_length")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String packageLength;
    /**
     * packageType
     */
    @JsonProperty("package_type")
    private String packageType;
    /**
     * packageWeight
     */
    @JsonProperty("package_weight")
    private String packageWeight;
    /**
     * packageWidth
     */
    @JsonProperty("package_width")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String packageWidth;
    /**
     * weightUnit
     */
    @JsonProperty("weight_unit")
    private String weightUnit;
}
