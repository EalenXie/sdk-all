package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:54
 */
@Getter
@Setter
public class CarVinCode {

    /**
     * vin码
     */
    @JsonProperty("vin码")
    private String vinCode;
}
