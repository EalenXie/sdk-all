package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/27 10:54
 */
@Getter
@Setter
public class CashOnDelivery {
    @JsonProperty("value")
    private Money value;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("express")
    private Boolean express;
}
