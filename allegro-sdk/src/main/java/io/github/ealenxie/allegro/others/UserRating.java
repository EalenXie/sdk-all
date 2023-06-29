package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 * @date 2023年06月29日, 0029 13:35
 */
@Getter
@Setter
public class UserRating {
    /**
     * answer
     */
    @JsonProperty("answer")
    private Answer answer;
    /**
     * buyer
     */
    @JsonProperty("buyer")
    private Buyer buyer;
    /**
     * comment
     */
    @JsonProperty("comment")
    private String comment;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * editedAt
     */
    @JsonProperty("editedAt")
    private String editedAt;
    /**
     * excludedFromAverageRates
     */
    @JsonProperty("excludedFromAverageRates")
    private Boolean excludedFromAverageRates;
    /**
     * excludedFromAverageRatesReason
     */
    @JsonProperty("excludedFromAverageRatesReason")
    private String excludedFromAverageRatesReason;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * lastChangedAt
     */
    @JsonProperty("lastChangedAt")
    private String lastChangedAt;
    /**
     * order
     */
    @JsonProperty("order")
    private UserRatingOrder order;
    /**
     * rates
     */
    @JsonProperty("rates")
    private Rates rates;
    /**
     * recommended
     */
    @JsonProperty("recommended")
    private Boolean recommended;
    /**
     * removal
     */
    @JsonProperty("removal")
    private Removal removal;
}
