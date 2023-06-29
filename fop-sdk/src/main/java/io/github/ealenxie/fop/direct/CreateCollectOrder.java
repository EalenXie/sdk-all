package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:37
 */
@Getter
@Setter
public class CreateCollectOrder {

    /**
     * 预约时间，格式为：yyyy-MM-dd
     */
    @JsonProperty("reserve_time")
    private String reserveTime;

    /**
     * 揽收地址信息
     */
    @JsonProperty("pickup_info")
    private PickupInfoPayload pickupInfo;
}
