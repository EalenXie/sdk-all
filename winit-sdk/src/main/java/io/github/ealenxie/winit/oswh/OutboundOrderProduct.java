package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 13:39
 */
@NoArgsConstructor
@Data
public class OutboundOrderProduct {
    /**
     * productCode
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * productNum
     */
    @JsonProperty("productNum")
    private String productNum;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * platformTransactionId
     */
    @JsonProperty("platformTransactionId")
    private String platformTransactionId;
    /**
     * platformItemId
     */
    @JsonProperty("platformItemId")
    private String platformItemId;
    /**
     * platformSellerId
     */
    @JsonProperty("platformSellerId")
    private String platformSellerId;
    /**
     * platformBuyerId
     */
    @JsonProperty("platformBuyerId")
    private String platformBuyerId;
}
