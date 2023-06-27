package io.github.ealenxie.fop.grs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/2 12:32
 */
@Getter
@Setter
public class RmaInfoList {

    /**
     * 分页面数量，默认值为100
     */
    @JsonProperty("page_count")
    private Integer pageCount;

    /**
     * 分页开始页，默认值为0
     */
    @JsonProperty("page_start")
    private Integer pageStart;

    /**
     * 退货物流单号
     */
    @JsonProperty("received_shipping_no")
    private String receivedShippingNo;

    /**
     * 收货的结束时间
     */
    @JsonProperty("recevier_time_end")
    private String recevierTimeEnd;

    /**
     * 收货的开始时间
     */
    @JsonProperty("recevier_time_start")
    private String recevierTimeStart;

    /**
     * 退货单（退货预报单）
     */
    @JsonProperty("rma_no")
    private String rmaNo;
}
