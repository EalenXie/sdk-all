package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:36
 */
@Getter
@Setter
public class Goods {
    @JsonProperty("categoryCode")
    private String categoryCode;
    @JsonProperty("categoryName")
    private String categoryName;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("declareQuality")
    private Integer declareQuality;
    @JsonProperty("goodsName")
    private String goodsName;
    @JsonProperty("goodsNo")
    private String goodsNo;
    @JsonProperty("unitPrice")
    private Double unitPrice;
}
