package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class ParcelItem {
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    @JsonProperty("weight")
    private UnitPayload weight;
    @JsonProperty("description")
    private String description;
    @JsonProperty("value")
    private Money value;
    @JsonProperty("type")
    private String type;
}
