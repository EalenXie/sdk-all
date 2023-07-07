package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/7 17:09
 * @version 1.0
 */
@Getter
@Setter
public class IncentiveResponse {

    /**
     * totalItems
     */
    @JsonProperty("totalItems")
    private Integer totalItems;
    /**
     * items
     */
    @JsonProperty("items")
    private List<Items> items;
}
