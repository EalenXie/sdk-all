package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 11:32
 */
@Getter
@Setter
public class ShippingDetail {
    /**
     * twoDayShipping
     */
    @JsonProperty("twoDayShipping")
    private List<TwoDayShipping> twoDayShipping;
}
