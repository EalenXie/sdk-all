package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/25 15:00
 */
@Getter
@Setter
public class FpxTrackingNoDTO {


    private String fpxTrackingNo;

    private Double parcelValue;

    private String currency;


    @JsonProperty("goodsList")
    private List<Goods> goodsList;


}
