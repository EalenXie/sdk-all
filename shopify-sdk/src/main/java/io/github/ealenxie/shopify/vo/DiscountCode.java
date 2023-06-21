package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DiscountCode {

    /**
     * 折扣代码
     **/
    @JsonProperty("code")
    private String code;
    /**
     * 折扣金额   从订单总额中扣除的金额
     **/
    @JsonProperty("amount")
    private String amount;
    /**
     * 类型
     * fixed_amount：货币的单位
     * percentage：百分比
     * shipping：免运费折扣
     **/
    @JsonProperty("type")
    private String type;

}
