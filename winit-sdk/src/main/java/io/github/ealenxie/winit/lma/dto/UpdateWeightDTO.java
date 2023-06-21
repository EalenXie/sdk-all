package io.github.ealenxie.winit.lma.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author create by sch  2023/4/21 15:23
 * @version 1.0
 */
@Getter
@Setter
public class UpdateWeightDTO {

    /**
     * winit订单号
     */
    @JsonProperty("orderNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderNo;
    /**
     * 重量(KG)
     */
    @JsonProperty("weight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal weight;
    /**
     * 长(CM)
     */
    @JsonProperty("length")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal length;
    /**
     * 宽(CM)
     */
    @JsonProperty("width")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal width;
    /**
     * 高
     */
    @JsonProperty("height")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal height;
}
