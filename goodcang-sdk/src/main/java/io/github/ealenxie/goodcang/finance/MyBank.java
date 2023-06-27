package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 11:28
 */
@Getter
@Setter
public class MyBank {

    /**
     * 银行编码
     */
    @JsonProperty("bank_code")
    private String bankCode;
    /**
     * 银行中文名
     */
    @JsonProperty("bank_name_cn")
    private String bankNameCn;
    /**
     * 银行英文名
     */
    @JsonProperty("bank_name_en")
    private String bankNameEn;
    /**
     * 是否第三方
     */
    @JsonProperty("is_third")
    private String isThird;
}
