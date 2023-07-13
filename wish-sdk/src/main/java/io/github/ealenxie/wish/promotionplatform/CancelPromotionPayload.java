package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 15:40
 * @version 1.0
 */
@Getter
@Setter
public class CancelPromotionPayload {

    /**
     * comment
     */
    @JsonProperty("comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String comment;
    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
}
