package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月27日 0027 17 20
 */
@Getter
@Setter
public class InboundCreateVO {

    /**
     * 入库委托单号 。如：IC9002781804101123
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 4PX跟踪号；入库委托创建成功后返回。4PX唯一单号；可跟进跟踪号在4PX轨迹系统查询轨迹信息。如：9082324423
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

}
