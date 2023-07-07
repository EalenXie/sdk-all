package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:14
 */
@Getter
@Setter
public class CriteriaData {
    /**
     * orders
     */
    @JsonProperty("orders")
    private Integer orders;
    /**
     * deliveryDefectRate
     */
    @JsonProperty("deliveryDefectRate")
    private String deliveryDefectRate;
    /**
     * cancellationRate
     */
    @JsonProperty("cancellationRate")
    private String cancellationRate;
    /**
     * listingQualityCatalog
     */
    @JsonProperty("listingQualityCatalog")
    private Integer listingQualityCatalog;
    /**
     * activeDays
     */
    @JsonProperty("activeDays")
    private Integer activeDays;
}
