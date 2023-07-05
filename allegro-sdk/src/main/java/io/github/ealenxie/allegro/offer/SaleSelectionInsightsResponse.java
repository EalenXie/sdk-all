package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 9:54
 */
@Getter
@Setter
public class SaleSelectionInsightsResponse {


    /**
     * products
     */
    @JsonProperty("products")
    private List<SelectionInsightProducts> products;
    /**
     * reportDate
     */
    @JsonProperty("reportDate")
    private String reportDate;
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
