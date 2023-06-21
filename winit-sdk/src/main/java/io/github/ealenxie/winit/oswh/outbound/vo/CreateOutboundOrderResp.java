package io.github.ealenxie.winit.oswh.outbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/20 16:22
 * @version 1.0
 */
@Getter
@Setter
public class CreateOutboundOrderResp {

    /**
     * 出库订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * BW：仓群间拆单
     * WW：仓群内拆单
     * NONE：不拆单
     */
    @JsonProperty("splitType")
    private String splitType;
    /**
     * 出库订单号列表，拆单时返回多个
     */
    @JsonProperty("orderNoList")
    private List<String> orderNoList;
}
