package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/3 11:24
 **/
@Getter
@Setter
public class CancelOrderDTO {
    /**
     * winit订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 作废备注
     */
    @JsonProperty("remark")
    private String remark;
}

