package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class AdditionalServicesPayload {
    @JsonProperty("cashOnDelivery")
    private CashOnDeliveryPayload cashOnDelivery;
    @JsonProperty("options")
    private List<String> options;
}
