package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class TaxLine {

    /**
     * 价格
     **/
    @JsonProperty("price")
    private String price;
    /**
     * 税率
     **/
    @JsonProperty("rate")
    private BigDecimal rate;
    /**
     * 标题
     **/
    @JsonProperty("title")
    private String title;
    /**
     * 价格集
     **/
    @JsonProperty("price_set")
    private DataSet priceSet;

}
