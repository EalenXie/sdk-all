package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/7 12:18
 */
@Getter
@Setter
public class CarNumber {


    /**
     * score
     */
    @JsonProperty("score")
    private Double score;
    /**
     * data
     */
    @JsonProperty("data")
    private CarNumberData data;
    /**
     * 车牌类型信息
     */
    @JsonProperty("secondary_cls")
    private SecondaryCls secondaryCls;
    /**
     * 结构化坐标信息。（和prism_keyValueInfo字段包含信息一致）。
     */
    @JsonProperty("info")
    private List<CarNumberInfo> info;
}
