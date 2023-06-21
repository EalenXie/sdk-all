package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/7 14:20
 * @version 1.0
 */
@Getter
@Setter
public class InboundOrder {
    /**
     * 入库单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 起航时间。格式：yyyy-MM-dd,如果入库单的预计送仓方式是整柜时必填
     */
    @JsonProperty("sailingTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sailingTime;
    /**
     * 集装箱号,如果入库单的预计送仓方式是整柜时，必填
     */
    @JsonProperty("containerNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String containerNo;
    /**
     * 进口商
     * <p>
     * 当订单目的国为UK\DE时，必填
     */
    @JsonProperty("importerCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String importerCode;
}
