package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 16:35
 */
@Getter
@Setter
public class EnablePayload {

    /**
     * enable
     */
    @JsonProperty("enable")
    private Boolean enable;
}
