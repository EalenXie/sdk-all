package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tax {
    /**
     * 税收金额
     */
    @JsonProperty("taxAmount")
    private TaxAmount taxAmount;
    /**
     * 税收名称
     */
    @JsonProperty("taxName")
    private String taxName;

}
