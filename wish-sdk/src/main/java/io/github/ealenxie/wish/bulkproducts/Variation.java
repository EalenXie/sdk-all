package io.github.ealenxie.wish.bulkproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/12 13:17
 */
@Getter
@Setter
public class Variation {
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
    private List<Attribute> attributes;
    /**
     * inventories
     */
    @JsonProperty("inventories")
    private List<Inventories> inventories;
    /**
     * options
     */
    @JsonProperty("options")
    private List<Attribute> options;
    /**
     * logisticsDetails
     */
    @JsonProperty("logistics_details")
    private LogisticsDetails logisticsDetails;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
