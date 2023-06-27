package io.github.ealenxie.fop.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:53
 */
@Getter
@Setter
public class PdsOrderCancel {

    /**
     * 4PX跟踪号（预分配号段的客户可传此值）
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 外部物流单号（客户自有系统的单号，如客户单号），映射到外部物流单号logistics_code
     */
    @JsonProperty("logisticsCode")
    private String logisticsCode;

    /**
     * 袋号
     */
    @JsonProperty("bagNo")
    private String bagNo;

    /**
     * 卡板号
     */
    @JsonProperty("plateNo")
    private String plateNo;

    /**
     * 面单号
     */
    @JsonProperty("labelNo")
    private String labelNo;

    /**
     * 业务类型
     * <p>
     * 澳洲同城：LOCAL_AU
     * <p>
     * 京广速递：KING_KONG
     */
    @JsonProperty("businessType")
    private String businessType;
}
