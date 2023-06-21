package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/3 12:25
 */
@Getter
@Setter
public class Overpaid {
    @JsonProperty("value")
    private Money value;
}
