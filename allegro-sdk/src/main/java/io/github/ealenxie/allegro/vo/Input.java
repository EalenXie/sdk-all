package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/4 14:47
 */
@Getter
@Setter
public class Input {
    @JsonProperty("parcelId")
    private String parcelId;
}
