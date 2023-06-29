package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 13:16
 */
@Getter
@Setter
public class ParcelPayload {
    /**
     * 包裹高度
     */
    @JsonProperty("parcel_heigh")
    private Integer parcelHeigh;

    /**
     * 包裹长度
     */
    @JsonProperty("parcel_length")
    private Integer parcelLength;

    /**
     * 包裹价值
     */
    @JsonProperty("parcel_value")
    private Integer parcelValue;

    /**
     * 包裹币种
     */
    @JsonProperty("parcel_currency")
    private String parcelCurrency;

    /**
     * 包裹重量
     */
    @JsonProperty("parcel_weight")
    private Integer parcelWeight;

    /**
     * 包裹宽度
     */
    @JsonProperty("parcel_width")
    private Integer parcelWidth;
}
