package io.github.ealenxie.walmart.marketplace.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/10 14:57
 * @version 1.0
 */
@Getter
@Setter
public class PriceDisplayCodes {
    /**
     * isRollback
     */
    @JsonProperty("isRollback")
    private Boolean isRollback;
    /**
     * isStrikethrough
     */
    @JsonProperty("isStrikethrough")
    private Boolean isStrikethrough;
    /**
     * isReducedPrice
     */
    @JsonProperty("isReducedPrice")
    private Boolean isReducedPrice;
    /**
     * isClearance
     */
    @JsonProperty("isClearance")
    private Boolean isClearance;
}
