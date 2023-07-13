package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 15:07
 */
@NoArgsConstructor
@Data
public class ProductFeedback {

    /**
     * feedbackMessage
     */
    @JsonProperty("feedback_message")
    private String feedbackMessage;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * feedbackType
     */
    @JsonProperty("feedback_type")
    private String feedbackType;
    /**
     * campaignId
     */
    @JsonProperty("campaign_id")
    private String campaignId;
}
