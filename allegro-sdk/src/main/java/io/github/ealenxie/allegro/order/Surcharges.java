package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
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
