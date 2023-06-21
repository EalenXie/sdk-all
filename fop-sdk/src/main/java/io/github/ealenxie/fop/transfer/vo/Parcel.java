package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 20:36
 */
@Getter
@Setter
public class Parcel {
    @JsonProperty("goodsList")
    private List<Goods> goodsList;
    @JsonProperty("grossWeight")
    private Integer grossWeight;
    @JsonProperty("isIncludeBattery")
    private Integer isIncludeBattery;
    @JsonProperty("largeFlag")
    private Integer largeFlag;
    @JsonProperty("preWeight")
    private Integer preWeight;
    @JsonProperty("specialIdentify")
    private String specialIdentify;
    @JsonProperty("volumeHeight")
    private Integer volumeHeight;
    @JsonProperty("volumeLength")
    private Integer volumeLength;
    @JsonProperty("volumeUnit")
    private String volumeUnit;
    @JsonProperty("volumeWeight")
    private Integer volumeWeight;
    @JsonProperty("volumeWide")
    private Integer volumeWide;
    @JsonProperty("weightUnit")
    private String weightUnit;
}
