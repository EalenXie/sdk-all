package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@NoArgsConstructor
@Data
public class SaleAggregate {
    /**
     * productPrice
     */
    @JsonProperty("productPrice")
    private Double productPrice;
    /**
     * shipping
     */
    @JsonProperty("shipping")
    private Double shipping;
    /**
     * netTaxCollected
     */
    @JsonProperty("netTaxCollected")
    private Double netTaxCollected;
    /**
     * productTaxCollected
     */
    @JsonProperty("productTaxCollected")
    private Double productTaxCollected;
    /**
     * shippingTaxCollected
     */
    @JsonProperty("shippingTaxCollected")
    private Double shippingTaxCollected;
    /**
     * netTaxWithheld
     */
    @JsonProperty("netTaxWithheld")
    private Double netTaxWithheld;
    /**
     * productTaxWithheld
     */
    @JsonProperty("productTaxWithheld")
    private Double productTaxWithheld;
    /**
     * shippingTaxWithheld
     */
    @JsonProperty("shippingTaxWithheld")
    private Integer shippingTaxWithheld;
    /**
     * netComm
     */
    @JsonProperty("netComm")
    private Double netComm;
    /**
     * netPayable
     */
    @JsonProperty("netPayable")
    private Double netPayable;
    /**
     * wfsShipping
     */
    @JsonProperty("wfsShipping")
    private Double wfsShipping;
    /**
     * wfsShipppingTax
     */
    @JsonProperty("wfsShipppingTax")
    private Double wfsShipppingTax;
    /**
     * totalBaseCommission
     */
    @JsonProperty("totalBaseCommission")
    private Double totalBaseCommission;
    /**
     * commissionSavings
     */
    @JsonProperty("commissionSavings")
    private Double commissionSavings;
}
