package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:28
 */
@Getter
@Setter
public class Carrier {
    /**
     * shipperName
     */
    @JsonProperty("shipperName")
    private String shipperName;
    /**
     * shipperCode
     */
    @JsonProperty("shipperCode")
    private String shipperCode;
}
