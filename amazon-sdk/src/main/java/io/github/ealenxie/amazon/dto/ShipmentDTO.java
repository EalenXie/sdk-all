package io.github.ealenxie.amazon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/22 17:49
 */
@Getter
@Setter
public class ShipmentDTO {


    /**
     * 市场标识符
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    /**
     * 申请装运状态
     * 枚举：ReadyForPickup、PickedUp、RefusedPickup
     */
    @JsonProperty("shipmentStatus")
    private String shipmentStatus;
    /**
     * 要更新的订单项目和数量列表
     */
    @JsonProperty("orderItems")
    private List<OrderItem> orderItems;


}
