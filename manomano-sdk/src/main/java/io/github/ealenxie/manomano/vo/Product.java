package io.github.ealenxie.manomano.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/8/16 9:45
 */
@Getter
@Setter
public class Product {
    @JsonProperty("sku")
    private String sku;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * 单价
     */
    @JsonProperty("price")
    private String price;
    /**
     * 不含增值锐单价
     */
    @JsonProperty("price_vat_excl")
    private String priceVatExcl;
    /**
     * 增值锐率
     */
    @JsonProperty("vat_rate")
    private String vatRate;
    /**
     * 运费增值锐率
     */
    @JsonProperty("shipping_vat_rate")
    private String shippingVatRate;
    /**
     * 运送方式
     */
    @JsonProperty("carrier")
    private String carrier;
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
}
