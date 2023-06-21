package io.github.ealenxie.edayun.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 派送信息
 */
@Getter
@Setter
public class ShipmentInfo {
    /**
     * 派送服务商
     */
    private String courierName;
    /**
     * 运输单号/跟踪号
     */
    private String trackingNum;
}
