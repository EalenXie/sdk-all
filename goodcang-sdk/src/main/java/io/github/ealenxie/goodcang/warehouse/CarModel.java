package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 13:10
 */
@Getter
@Setter
public class CarModel {


    /**
     * 车型代码
     */
    @JsonProperty("car_model_code")
    private String carModelCode;
    /**
     * 车型名称
     */
    @JsonProperty("car_model_name")
    private String carModelName;
}
