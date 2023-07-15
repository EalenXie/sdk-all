package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/15 13:48
 */
@Getter
@Setter
public class OrderVerdorTrackingData {


    /**
     * trackingnos
     */
    @JsonProperty("trackingnos")
    private String trackingnos;

    @JsonProperty("language")
    private String language;

}
