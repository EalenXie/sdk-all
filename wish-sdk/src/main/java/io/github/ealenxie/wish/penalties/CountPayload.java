package io.github.ealenxie.wish.penalties;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 14:14
 */
@Getter
@Setter
public class CountPayload {
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
}
