package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 15:38
 * @version 1.0
 */
@Setter
@Getter
public class CatalogResponse {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<Payload> payload;
    /**
     * limit
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * totalItems
     */
    @JsonProperty("totalItems")
    private Integer totalItems;
    /**
     * nextCursor
     */
    @JsonProperty("nextCursor")
    private String nextCursor;
}
