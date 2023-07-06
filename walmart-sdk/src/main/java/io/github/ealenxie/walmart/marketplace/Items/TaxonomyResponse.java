package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:52
 * @version 1.0
 */
@Getter
@Setter
public class TaxonomyResponse {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<TaxonomyPayload> payload;
}
