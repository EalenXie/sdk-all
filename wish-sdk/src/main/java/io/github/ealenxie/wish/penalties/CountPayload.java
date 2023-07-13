package io.github.ealenxie.wish.penalties;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 14:14
 */
@NoArgsConstructor
@Data
public class CountPayload {
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
}
