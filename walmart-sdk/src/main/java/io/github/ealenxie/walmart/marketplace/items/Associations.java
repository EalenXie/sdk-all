package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 15:43
 * @version 1.0
 */
@Getter
@Setter
public class Associations {
    /**
     * shippingTemplate
     */
    @JsonProperty("shippingTemplate")
    private ShippingTemplate shippingTemplate;
    /**
     * shipNodeName
     */
    @JsonProperty("shipNodeName")
    private String shipNodeName;
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private String shipNode;
}
