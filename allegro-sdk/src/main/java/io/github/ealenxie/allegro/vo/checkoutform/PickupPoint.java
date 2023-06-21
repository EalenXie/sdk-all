package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class PickupPoint {
    /**
     * 交货点编号
     */
    @JsonProperty("id")
    private String id;
    /**
     * 交货点名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 交货点说明
     */
    @JsonProperty("description")
    private String description;
    /**
     * 地址
     */
    @JsonProperty("address")
    private DeliveryAddress address;
}
