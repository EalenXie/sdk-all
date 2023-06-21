package io.github.ealenxie.winit.lma.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:56
 * @version 1.0
 */
@Getter
@Setter
public class QueryOrderInfoDTO {

    /**
     * winit订单号
     */
    @JsonProperty("winitOrderNo")
    private String winitOrderNo;
    /**
     * 卖家订单号
     */
    @JsonProperty("sellerOrderNo")
    private String sellerOrderNo;
}
