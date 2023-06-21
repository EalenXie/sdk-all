package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:56
 */
@Getter
@Setter
public class Dimensions {
    @JsonProperty("height")
    private Height height;
    @JsonProperty("width")
    private Height width;
    @JsonProperty("depth")
    private Height depth;
}
