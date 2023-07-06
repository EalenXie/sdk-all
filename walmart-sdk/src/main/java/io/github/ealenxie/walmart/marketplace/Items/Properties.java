package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:44
 * @version 1.0
 */
@Getter
@Setter
public class Properties {
    /**
     * variantItemsNum
     */
    @JsonProperty("variant_items_num")
    private String variantItemsNum;
    /**
     * numReviews
     */
    @JsonProperty("num_reviews")
    private String numReviews;
    /**
     * categories
     */
    @JsonProperty("categories")
    private List<String> categories;
    /**
     * variants
     */
    @JsonProperty("variants")
    private Variants variants;
    /**
     * nextDayEligible
     */
    @JsonProperty("next_day_eligible")
    private Boolean nextDayEligible;
}
