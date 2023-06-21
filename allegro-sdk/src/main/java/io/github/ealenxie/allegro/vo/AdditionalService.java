package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:50
 */
@Getter
@Setter
public class AdditionalService {
    @JsonProperty("cashOnDelivery")
    private CashOnDelivery cashOnDelivery;
    @JsonProperty("options")
    private List<Options> options;
}
