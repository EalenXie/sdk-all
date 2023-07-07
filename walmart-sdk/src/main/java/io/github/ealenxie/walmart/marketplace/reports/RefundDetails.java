package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@NoArgsConstructor
@Data
public class RefundDetails {
    /**
     * productPrice
     */
    @JsonProperty("productPrice")
    private BigDecimal productPrice;
    /**
     * shipping
     */
    @JsonProperty("shipping")
    private BigDecimal shipping;
    /**
     * netTaxCollected
     */
    @JsonProperty("netTaxCollected")
    private BigDecimal netTaxCollected;
    /**
     * productTaxCollected
     */
    @JsonProperty("productTaxCollected")
    private BigDecimal productTaxCollected;
    /**
     * shippingTaxCollected
     */
    @JsonProperty("shippingTaxCollected")
    private BigDecimal shippingTaxCollected;
    /**
     * netTaxWithheld
     */
    @JsonProperty("netTaxWithheld")
    private BigDecimal netTaxWithheld;
    /**
     * productTaxWithheld
     */
    @JsonProperty("productTaxWithheld")
    private BigDecimal productTaxWithheld;
    /**
     * shippingTaxWithheld
     */
    @JsonProperty("shippingTaxWithheld")
    private BigDecimal shippingTaxWithheld;
    @JsonProperty("netFeeCollected")
    private BigDecimal netFeeCollected;
    @JsonProperty("netFeeWithheld")
    private BigDecimal netFeeWithheld;
    /**
     * netComm
     */
    @JsonProperty("netComm")
    private BigDecimal netComm;
    /**
     * netPayable
     */
    @JsonProperty("netPayable")
    private BigDecimal netPayable;

    /**
     * aboveCap
     */
    @JsonProperty("aboveCap")
    private BigDecimal aboveCap;

    /**
     * wfsShipping
     */
    @JsonProperty("wfsShipping")
    private BigDecimal wfsShipping;

    @JsonProperty("wfsShipppingTax")
    private BigDecimal wfsShippingTax;
    /**
     * totalBaseCommission
     */
    @JsonProperty("totalBaseCommission")
    private BigDecimal totalBaseCommission;
    /**
     * commissionSavings
     */
    @JsonProperty("commissionSavings")
    private BigDecimal commissionSavings;
}
