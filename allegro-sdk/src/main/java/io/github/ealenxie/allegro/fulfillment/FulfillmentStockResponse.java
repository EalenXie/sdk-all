package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 9:48
 * @version 1.0
 */
@Setter
@Getter
public class FulfillmentStockResponse {

    /**
     * stock
     */
    @JsonProperty("stock")
    private List<Stock> stock;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
