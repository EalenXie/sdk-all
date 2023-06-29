package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 0:04
 */
@Getter
@Setter
public class Fee {
    /**
     * 费用代码
     */
    @JsonProperty("fee_code")
    private String feeCode;

    /**
     * 费用金额（根据产品报价计算出的金额，匹配报价先后顺序为：先协议价、再等级价、最后公布价）
     */
    @JsonProperty("amount")
    private Integer amount;

    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
}
