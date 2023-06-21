package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/3 12:36
 */
@Getter
@Setter
public class Surcharges {
    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private Money value;
}
