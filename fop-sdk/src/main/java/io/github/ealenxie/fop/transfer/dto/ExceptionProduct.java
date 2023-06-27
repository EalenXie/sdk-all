package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:09
 */
@Getter
@Setter
public class ExceptionProduct {
    /**
     * 商品数量
     */
    @JsonProperty("declareProductCodeQty")
    private Integer declareProductCodeQty;

    /**
     * 商品编号
     */
    @JsonProperty("goodsNo")
    private String goodsNo;
}
