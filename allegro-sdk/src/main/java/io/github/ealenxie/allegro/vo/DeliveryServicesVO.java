package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:49
 */
@Getter
@Setter
public class DeliveryServicesVO {
    @JsonProperty("deliveryServices")
    private List<DeliveryServices> deliveryServices;
}
