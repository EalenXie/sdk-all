package io.github.ealenxie.paypal.paymentexperience;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/29 11:37
 */
@NoArgsConstructor
@Data
public class Presentation {
    /**
     * logoImage
     */
    @JsonProperty("logo_image")
    private String logoImage;
}
