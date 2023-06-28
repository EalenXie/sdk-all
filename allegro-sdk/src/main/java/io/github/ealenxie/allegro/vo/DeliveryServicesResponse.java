package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/27 10:49
 */
@Getter
@Setter
public class DeliveryServicesResponse {
    @JsonProperty("deliveryServices")
    private List<DeliveryServices> deliveryServices;
}
