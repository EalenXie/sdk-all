package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.NameValuePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/12 11:23
 * @version 1.0
 */
@Getter
@Setter
public class LagTimePayload {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * fulfillmentLagTime
     */
    @JsonProperty("fulfillmentLagTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fulfillmentLagTime;

    /**
     * additionalAttributes
     */
    @JsonProperty("additionalAttributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<NameValuePayload> additionalAttributes;
}
