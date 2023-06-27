package io.github.ealenxie.fop.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 0:02
 */
@Getter
@Setter
public class CargoUnit {
    /**
     * 货物单位-值
     */
    @JsonProperty("value")
    private Integer value;

    /**
     * 货物单位，可选 BOX：箱 PAO：票 JIN：件
     */
    @JsonProperty("unit")
    private String unit;
}
