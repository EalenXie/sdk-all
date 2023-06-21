package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/31 17:04
 * @version 1.0
 */
@Getter
@Setter
public class ApproveInboundDTO {
    /**
     * 计划到达日期[有效预约到仓日期为仓库时间周一至周五9:00-16:30]
     */
    @JsonProperty("planArrivalDate")
    private String planArrivalDate;
    /**
     * 入库单号
     */
    @JsonProperty("receivingCode")
    private String receivingCode;
    /**
     * 预约类型[1:提交预约 0:取消预约]
     */
    @JsonProperty("receivingStatus")
    private Integer receivingStatus;
    /**
     * 确认跟踪号/柜号
     */
    @JsonProperty("trackingNumber")
    private String trackingNumber;
}
