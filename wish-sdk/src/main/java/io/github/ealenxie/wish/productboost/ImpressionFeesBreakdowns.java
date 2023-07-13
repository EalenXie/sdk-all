package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 14:33
 */
@NoArgsConstructor
@Data
public class ImpressionFeesBreakdowns {
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
    /**
     * startAt
     */
    @JsonProperty("start_at")
    private String startAt;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * endAt
     */
    @JsonProperty("end_at")
    private String endAt;
}
