package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:17
 */
@Getter
@Setter
public class OrderList {
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("elements")
    private Elements elements;
}
