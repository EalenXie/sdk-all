package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 10:13
 */
@Getter
@Setter
public class CarriersPointServices {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
