package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@Getter
@Setter
public class Variations {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * quantityValue
     */
    @JsonProperty("quantity_value")
    private Integer quantityValue;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * options
     */
    @JsonProperty("options")
    private List<Options> options;
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
     * requestId
     */
    @JsonProperty("request_id")
    private String requestId;
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
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * logisticsDetails
     */
    @JsonProperty("logistics_details")
    private LogisticsDetails logisticsDetails;


}
