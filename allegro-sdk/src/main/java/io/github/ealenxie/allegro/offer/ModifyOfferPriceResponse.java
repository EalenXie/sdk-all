package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdInputPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 16:38
 */
@Getter
@Setter
public class ModifyOfferPriceResponse extends IdInputPayload<BuyNowPricePayload> {

    /**
     * output
     */
    @JsonProperty("output")
    private Output output;
}
