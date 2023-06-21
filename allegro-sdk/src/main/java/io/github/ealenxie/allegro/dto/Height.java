package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class Height {
    @JsonProperty("value")
    private String value;
    @JsonProperty("unit")
    private String unit;
}
