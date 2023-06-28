package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class Dimensions {
    @JsonProperty("height")
    private UnitPayload height;
    @JsonProperty("width")
    private UnitPayload width;
    @JsonProperty("depth")
    private UnitPayload depth;
}
