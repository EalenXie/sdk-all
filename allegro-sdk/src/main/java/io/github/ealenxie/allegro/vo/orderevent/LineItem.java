package io.github.ealenxie.allegro.vo.orderevent;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:08
 */
@Getter
@Setter
public class LineItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("offer")
    private Offer offer;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("originalPrice")
    private Money originalPrice;
    @JsonProperty("price")
    private Money price;
    @JsonProperty("boughtAt")
    private String boughtAt;
}
