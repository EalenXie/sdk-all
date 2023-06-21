package io.github.ealenxie.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 0:02
 */
@Getter
@Setter
public class CargoUnit {
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("unit")
    private String unit;
}
