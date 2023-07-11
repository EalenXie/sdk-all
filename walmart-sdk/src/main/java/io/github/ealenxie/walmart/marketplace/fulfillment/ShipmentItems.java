package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 14:26
 */
@Getter
@Setter
public class ShipmentItems {
    /**
     * vendorSku
     */
    @JsonProperty("vendorSku")
    private String vendorSku;
    /**
     * productType
     */
    @JsonProperty("productType")
    private String productType;
    /**
     * productId
     */
    @JsonProperty("productId")
    private String productId;
    /**
     * itemQty
     */
    @JsonProperty("itemQty")
    private Integer itemQty;
    /**
     * netTransferCharge
     */
    @JsonProperty("netTransferCharge")
    private Double netTransferCharge;
    /**
     * currencyUnit
     */
    @JsonProperty("currencyUnit")
    private String currencyUnit;
}
