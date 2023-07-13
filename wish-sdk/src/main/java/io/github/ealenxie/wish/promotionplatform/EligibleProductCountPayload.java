package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 17:00
 * @version 1.0
 */
@Getter
@Setter
public class EligibleProductCountPayload {
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
}
