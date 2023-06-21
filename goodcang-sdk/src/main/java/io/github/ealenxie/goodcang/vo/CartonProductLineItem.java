package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/10/21 11:17
 */
@Getter
@Setter
public class CartonProductLineItem {

    /**
     * 商品sku
     */
    private String sku;
    /**
     * 申报价值(USD) 必须在0.01到999999999.99范围内，不能为0，最多保留2位小数；
     */
    @JsonProperty("product_declared_value")
    private String productDeclaredValue;
    /**
     * 海关编码，必须为6-10位数字
     */
    @JsonProperty("hs_code")
    private String hsCode;

}
