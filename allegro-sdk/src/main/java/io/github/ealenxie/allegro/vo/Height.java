package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:56
 */
@Getter
@Setter
public class Height {
    @JsonProperty("value")
    private String value;
    @JsonProperty("unit")
    private String unit;
}
