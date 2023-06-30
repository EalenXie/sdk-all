package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@Getter
@Setter
public class MessageToSellerSettings {
    /**
     * mode
     */
    @JsonProperty("mode")
    private String mode;
    /**
     * hint
     */
    @JsonProperty("hint")
    private String hint;
}
