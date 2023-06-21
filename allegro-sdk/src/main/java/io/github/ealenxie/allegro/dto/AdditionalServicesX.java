package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class AdditionalServicesX {
    @JsonProperty("cashOnDelivery")
    private CashOnDelivery cashOnDelivery;
    @JsonProperty("options")
    private List<String> options;
}
