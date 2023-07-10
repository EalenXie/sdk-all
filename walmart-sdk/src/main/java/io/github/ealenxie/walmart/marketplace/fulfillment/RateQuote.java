package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 14:40
 */
@NoArgsConstructor
@Data
public class RateQuote {
    /**
     * quoteId
     */
    @JsonProperty("quoteId")
    private String quoteId;
    /**
     * estimatedDeliveryDateTime
     */
    @JsonProperty("estimatedDeliveryDateTime")
    private String estimatedDeliveryDateTime;
    /**
     * carrier
     */
    @JsonProperty("carrier")
    private Carrier carrier;
    /**
     * currency
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * discountCharge
     */
    @JsonProperty("discountCharge")
    private Integer discountCharge;
    /**
     * netCharge
     */
    @JsonProperty("netCharge")
    private Integer netCharge;
    /**
     * surchargeType
     */
    @JsonProperty("surchargeType")
    private String surchargeType;
    /**
     * surchargeValue
     */
    @JsonProperty("surchargeValue")
    private String surchargeValue;
    /**
     * totalBillingWeight
     */
    @JsonProperty("totalBillingWeight")
    private Integer totalBillingWeight;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * transitDays
     */
    @JsonProperty("transitDays")
    private String transitDays;
    /**
     * effectiveDate
     */
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    /**
     * expiryDate
     */
    @JsonProperty("expiryDate")
    private String expiryDate;
    /**
     * mode
     */
    @JsonProperty("mode")
    private String mode;
    /**
     * sellerFreightClassCode
     */
    @JsonProperty("sellerFreightClassCode")
    private String sellerFreightClassCode;
    /**
     * freightCharge
     */
    @JsonProperty("freightCharge")
    private Integer freightCharge;
    /**
     * fuelCharge
     */
    @JsonProperty("fuelCharge")
    private Integer fuelCharge;
    /**
     * totalWeight
     */
    @JsonProperty("totalWeight")
    private Integer totalWeight;
    /**
     * totalVolume
     */
    @JsonProperty("totalVolume")
    private Integer totalVolume;
    /**
     * equipmentTypeCode
     */
    @JsonProperty("equipmentTypeCode")
    private String equipmentTypeCode;
    /**
     * serviceCode
     */
    @JsonProperty("serviceCode")
    private String serviceCode;
    /**
     * numberOfPallets
     */
    @JsonProperty("numberOfPallets")
    private Integer numberOfPallets;
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
     * minimumCharge
     */
    @JsonProperty("minimumCharge")
    private Integer minimumCharge;
    /**
     * declaredValue
     */
    @JsonProperty("declaredValue")
    private String declaredValue;
    /**
     * mixedSKUs
     */
    @JsonProperty("mixedSKUs")
    private Integer mixedSKUs;
    /**
     * singleSKUs
     */
    @JsonProperty("singleSKUs")
    private Integer singleSKUs;
    /**
     * freightReadyDate
     */
    @JsonProperty("freightReadyDate")
    private String freightReadyDate;


}
