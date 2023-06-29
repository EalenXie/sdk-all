package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 10:12
 */
@Getter
@Setter
public class CarriersPointsResponse {
    /**
     * points
     */
    @JsonProperty("points")
    private List<CarriersPoint> points;
}
