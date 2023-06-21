package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/25 14:51
 */
@Getter
@Setter
public class PcsInboundCreate {
    @JsonProperty("outOrderId")
    private String outOrderId;
    @JsonProperty("bizSource")
    private String bizSource;
    @JsonProperty("buyerId")
    private String buyerId;
    @JsonProperty("labelBarcode")
    private String labelBarcode;
    @JsonProperty("subLabelBarcode")
    private String subLabelBarcode;
    @JsonProperty("includeBattery")
    private String includeBattery;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("parcelValue")
    private Double parcelValue;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("destCountry")
    private String destCountry;
    @JsonProperty("goodsList")
    private List<Goods> goodsList;
}
