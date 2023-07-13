package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 16:42
 */
@Getter
@Setter
public class VariationsPayload {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * quantityValue
     */
    @JsonProperty("quantity_value")
    private Integer quantityValue;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * cost
     */
    @JsonProperty("cost")
    private Money cost;
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * attributes
     */
    @JsonProperty("attributes")
    private List<Attributes> attributes;
    /**
     * inventories
     */
    @JsonProperty("inventories")
    private List<WarehouseInventory> inventories;
    /**
     * options
     */
    @JsonProperty("options")
    private List<Attributes> options;
    /**
     * logisticsDetails
     */
    @JsonProperty("logistics_details")
    private LogisticsDetails logisticsDetails;


}
