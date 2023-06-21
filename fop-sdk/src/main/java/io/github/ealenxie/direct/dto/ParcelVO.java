package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 13:16
 */
@Getter
@Setter
public class ParcelVO {
    @JsonProperty("parcel_heigh")
    private Integer parcelHeigh;
    @JsonProperty("parcel_length")
    private Integer parcelLength;
    @JsonProperty("parcel_value")
    private Integer parcelValue;
    @JsonProperty("parcel_currency")
    private String parcelCurrency;
    @JsonProperty("parcel_weight")
    private Integer parcelWeight;
    @JsonProperty("parcel_width")
    private Integer parcelWidth;
}
