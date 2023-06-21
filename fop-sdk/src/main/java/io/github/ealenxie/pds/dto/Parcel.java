package io.github.ealenxie.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/27 15:47
 */
@Getter
@Setter
public class Parcel {
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("weightUnit")
    private String weightUnit;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("volumeUnit")
    private String volumeUnit;
    @JsonProperty("parcelValue")
    private Integer parcelValue;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("includeBattery")
    private String includeBattery;
    @JsonProperty("productList")
    private List<ParcelProduct> productList;
}
