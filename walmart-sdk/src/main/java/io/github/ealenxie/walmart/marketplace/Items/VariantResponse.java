package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:58
 * @version 1.0
 */
@Getter
@Setter
public class VariantResponse {

    /**
     * status
     */
    @JsonProperty("status")
    private Integer status;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<VariantPayload> payload;
}
