package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class Parcel {
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("parcel_value")
    private Double parcelValue;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("include_battery")
    private String includeBattery;
    @JsonProperty("battery_type")
    private String batteryType;
    @JsonProperty("product_list")
    private List<Product> productList;
    @JsonProperty("declare_product_info")
    private List<DeclareProductInfo> declareProductInfo;


}
