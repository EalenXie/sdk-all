package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 0:04
 */
@Getter
@Setter
public class Fee {
    @JsonProperty("fee_code")
    private String feeCode;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("currency")
    private String currency;
}
