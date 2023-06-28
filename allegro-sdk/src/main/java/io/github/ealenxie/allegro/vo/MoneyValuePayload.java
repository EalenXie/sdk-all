package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/28 17:16
 */
@Getter
@Setter
public class MoneyValuePayload {
    @JsonProperty("value")
    private Money value;
}
