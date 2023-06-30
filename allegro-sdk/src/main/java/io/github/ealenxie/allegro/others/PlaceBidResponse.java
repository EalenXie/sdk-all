package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class PlaceBidResponse {

    /**
     * maxAmount
     */
    @JsonProperty("maxAmount")
    private Money maxAmount;
    /**
     * minimalPriceMet
     */
    @JsonProperty("minimalPriceMet")
    private Boolean minimalPriceMet;
    /**
     * highBidder
     */
    @JsonProperty("highBidder")
    private Boolean highBidder;
    /**
     * auction
     */
    @JsonProperty("auction")
    private Auction auction;
}
