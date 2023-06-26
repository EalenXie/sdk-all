package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:23
 */
@Getter
@Setter
public class ClaimOrderListPayload extends PagePayload {
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_code")
    private String trackingCode;
    /**
     * 认领单号
     */
    @JsonProperty("claim_code")
    private String claimCode;
    /**
     * 退件单号
     */
    @JsonProperty("asro_code")
    private String asroCode;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 状态
     */
    @JsonProperty("status")
    private Integer status;
    /**
     * 收货开始时间
     */
    @JsonProperty("create_time_start")
    private String createTimeStart;
    /**
     * 收货结束时间
     */
    @JsonProperty("create_time_end")
    private String createTimeEnd;
    /**
     * 销毁开始时间
     */
    @JsonProperty("dispose_time_start")
    private String disposeTimeStart;
    /**
     * 销毁结束时间
     */
    @JsonProperty("dispose_time_end")
    private String disposeTimeEnd;
    /**
     * 认领开始时间
     */
    @JsonProperty("claim_time_start")
    private String claimTimeStart;
    /**
     * 认领结束时间
     */
    @JsonProperty("claim_time_end")
    private String claimTimeEnd;
}
