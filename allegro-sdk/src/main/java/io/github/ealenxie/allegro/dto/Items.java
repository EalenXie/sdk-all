package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class Items {
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    @JsonProperty("weight")
    private Height weight;
    @JsonProperty("description")
    private String description;
    @JsonProperty("value")
    private Money value;
    @JsonProperty("type")
    private String type;
}
