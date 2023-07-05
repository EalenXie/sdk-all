package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/5 10:34
 */
@NoArgsConstructor
@Data
public class BatchOfferQuantityModify {
    /**
     * changeType
     */
    @JsonProperty("changeType")
    private String changeType;
    /**
     * value
     */
    @JsonProperty("value")
    private Integer value;
}
