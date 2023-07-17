package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:26
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShipperTypeData {

    /**
     * shipperType
     */
    @JsonProperty("shipperType")
    private String shipperType;
}
