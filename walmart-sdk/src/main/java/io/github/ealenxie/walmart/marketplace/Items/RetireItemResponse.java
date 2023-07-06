package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 17:08
 * @version 1.0
 */
@Getter
@Setter
public class RetireItemResponse {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
}
