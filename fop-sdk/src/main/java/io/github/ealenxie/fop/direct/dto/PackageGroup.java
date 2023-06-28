package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/24 17:45
 */
@Getter
@Setter
public class PackageGroup {

    /**
     * 服务商单号列表
     */
    @JsonProperty("orderList")
    private List<String> orderList;

    /**
     * 订单数量
     */
    @JsonProperty("orderNum")
    private Integer orderNum;

    /**
     * 大包实际重量，单位克
     */
    @JsonProperty("totalWeight")
    private Integer totalWeight;

    /**
     * 大包材质重，单位克
     */
    @JsonProperty("packageMaterialWeight")
    private Integer packageMaterialWeight;

    /**
     * 揽收地址
     * <p>
     * 如果传入的needPickup为“Y” 或者不传needPickup,此时揽收地址为必填，否则为非必填
     */
    @JsonProperty("pickupAddress")
    private PickupAddress pickupAddress;

    /**
     * 请求ID
     */
    @JsonProperty("requestId")
    private String requestId;
}
