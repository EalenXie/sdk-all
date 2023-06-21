package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:00
 * @version 1.0
 */
@Getter
@Setter
public class CreateLamOrderVO {

    /**
     * Winit订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
}
