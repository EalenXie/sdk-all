package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 14:14
 */
@NoArgsConstructor
@Data
public class TrackingStatusResponse {

    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 渠道名称
     */
    @JsonProperty("code")
    private String code;
    /**
     * 轨迹信息
     */
    @JsonProperty("trajectory_information")
    private List<TrajectoryInformation> trajectoryInformation;
}
