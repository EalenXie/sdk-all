package io.github.ealenxie.winit.oswh.inbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/2 16:04
 **/
@Getter
@Setter
public class InboundOrderVO {

    /**
     * 入库单号
     */
    @JsonProperty("orderNo")
    private String orderNo;

}

