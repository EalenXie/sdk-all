package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:09
 */
@Getter
@Setter
public class ExceptionProduct {
    @JsonProperty("declareProductCodeQty")
    private Integer declareProductCodeQty;
    @JsonProperty("goodsNo")
    private String goodsNo;
}
