package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 13:48
 */
@NoArgsConstructor
@Data
public class OrderVerdorTrackingData {


    /**
     * trackingnos
     */
    @JsonProperty("trackingnos")
    private String trackingnos;

    @JsonProperty("language")
    private String language;

}
