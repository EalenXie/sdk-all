package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:28
 */
@Getter
@Setter
public class ClaimOrder {

    /**
     * 跟踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
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
     * 退货服务类型
     */
    @JsonProperty("service_type")
    private Integer serviceType;
    /**
     * 状态
     */
    @JsonProperty("status")
    private Integer status;
    /**
     * 收货时间
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * 认领时间
     */
    @JsonProperty("claim_time")
    private String claimTime;
    /**
     * 销毁时间
     */
    @JsonProperty("destroy_time")
    private String destroyTime;
    /**
     * 超期销毁剩余时间
     */
    @JsonProperty("expire_destroy_time")
    private String expireDestroyTime;
    /**
     * 认领失败信息
     */
    @JsonProperty("error_message")
    private String errorMessage;
}
