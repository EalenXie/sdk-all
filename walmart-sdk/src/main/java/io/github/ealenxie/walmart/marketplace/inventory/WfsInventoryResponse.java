package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/12 11:09
 * @version 1.0
 */
@Getter
@Setter
public class WfsInventoryResponse {

    /**
     * headers
     */
    @JsonProperty("headers")
    private Header headers;
    /**
     * payload
     */
    @JsonProperty("payload")
    private WfsInventoryPayload payload;
}
