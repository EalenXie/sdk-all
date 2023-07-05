package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/5 10:26
 */
@NoArgsConstructor
@Data
public class BatchOfferPriceModify {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    @JsonProperty("price")
    private Money price;

}
