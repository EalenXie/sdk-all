package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 14:26
 */
@NoArgsConstructor
@Data
public class InboundPreview {
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private String shipNode;
    /**
     * isSortable
     */
    @JsonProperty("isSortable")
    private Boolean isSortable;
    /**
     * isNonSortable
     */
    @JsonProperty("isNonSortable")
    private Boolean isNonSortable;
    /**
     * nodeType
     */
    @JsonProperty("nodeType")
    private String nodeType;
    /**
     * shipToAddress
     */
    @JsonProperty("shipToAddress")
    private ShipToAddress shipToAddress;
    /**
     * totalNetTransferCharge
     */
    @JsonProperty("totalNetTransferCharge")
    private Double totalNetTransferCharge;
    /**
     * currencyUnit
     */
    @JsonProperty("currencyUnit")
    private String currencyUnit;
    /**
     * shipmentItems
     */
    @JsonProperty("shipmentItems")
    private List<ShipmentItems> shipmentItems;
}
