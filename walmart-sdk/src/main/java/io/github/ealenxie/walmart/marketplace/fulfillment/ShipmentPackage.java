package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 14:40
 */
@NoArgsConstructor
@Data
public class ShipmentPackage {
    /**
     * packageSequenceNumber
     */
    @JsonProperty("packageSequenceNumber")
    private Integer packageSequenceNumber;
    /**
     * weight
     */
    @JsonProperty("weight")
    private Integer weight;
    /**
     * weightUOM
     */
    @JsonProperty("weightUOM")
    private String weightUOM;
    /**
     * length
     */
    @JsonProperty("length")
    private Integer length;
    /**
     * height
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * lengthUOM
     */
    @JsonProperty("lengthUOM")
    private String lengthUOM;
    /**
     * labelInformation
     */
    @JsonProperty("labelInformation")
    private LabelInformation labelInformation;
    /**
     * billingWeight
     */
    @JsonProperty("billingWeight")
    private Integer billingWeight;
    /**
     * netCharge
     */
    @JsonProperty("netCharge")
    private Integer netCharge;
    /**
     * nominalCharge
     */
    @JsonProperty("nominalCharge")
    private Integer nominalCharge;
    /**
     * assessorialCharge
     */
    @JsonProperty("assessorialCharge")
    private Integer assessorialCharge;
    /**
     * serviceCharge
     */
    @JsonProperty("serviceCharge")
    private Integer serviceCharge;
    /**
     * packageType
     */
    @JsonProperty("packageType")
    private String packageType;
    /**
     * noOfPackages
     */
    @JsonProperty("noOfPackages")
    private Integer noOfPackages;
    /**
     * stackable
     */
    @JsonProperty("stackable")
    private Boolean stackable;
}
