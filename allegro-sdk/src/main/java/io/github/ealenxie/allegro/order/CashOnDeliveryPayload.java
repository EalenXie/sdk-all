package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class CashOnDeliveryPayload {
    @JsonProperty("value")
    private Money value;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("express")
    private Boolean express;
}
