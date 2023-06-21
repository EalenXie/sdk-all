package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BillingTax {
    /**
     * 税率 0-100
     */
    @JsonProperty("percentage")
    private String percentage;
    /**
     * 备注
     */
    @JsonProperty("annotation")
    private String annotation;
}
