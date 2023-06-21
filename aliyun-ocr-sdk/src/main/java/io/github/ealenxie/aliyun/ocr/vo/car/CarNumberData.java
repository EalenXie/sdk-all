package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:46
 */
@Getter
@Setter
public class CarNumberData {
    /**
     * 车牌号
     */
    @JsonProperty("车牌")
    private String licensePlate;
}
