package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/30 9:53
 */
@Getter
@Setter
public class TaskCount {
    /**
     * failed
     */
    @JsonProperty("failed")
    private Integer failed;
    /**
     * success
     */
    @JsonProperty("success")
    private Integer success;
    /**
     * total
     */
    @JsonProperty("total")
    private Integer total;
}
