package io.github.ealenxie.amazon.vo.order;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PointsGranted {
    /**
     * 亚马逊积分
     */
    @JsonProperty("PointsNumber")
    private Integer pointsNumber;
    /**
     * 亚马逊积分的货币价值
     */
    @JsonProperty("PointsMonetaryValue")
    private Money pointsMonetaryValue;
}
