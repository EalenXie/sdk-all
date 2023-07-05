package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 10:34
 */
@Getter
@Setter
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
