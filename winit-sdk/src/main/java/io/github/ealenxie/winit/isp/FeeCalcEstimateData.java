package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 18:00
 */
@Getter
@Setter
public class FeeCalcEstimateData {

    /**
     * shipperAddrCode
     */
    @JsonProperty("shipperAddrCode")
    private String shipperAddrCode;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * buyerCountryCode
     */
    @JsonProperty("buyerCountryCode")
    private String buyerCountryCode;
    /**
     * buyerPostcode
     */
    @JsonProperty("buyerPostcode")
    private String buyerPostcode;
    /**
     * length
     */
    @JsonProperty("length")
    private String length;
    /**
     * width
     */
    @JsonProperty("width")
    private String width;
    /**
     * height
     */
    @JsonProperty("height")
    private String height;
    /**
     * weight
     */
    @JsonProperty("weight")
    private String weight;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * declareValueTotal
     */
    @JsonProperty("declareValueTotal")
    private String declareValueTotal;
}
