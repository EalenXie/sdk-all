package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:37
 */
@Getter
@Setter
public class CreateCollectOrder {


    @JsonProperty("reserve_time")
    private String reserveTime;
    @JsonProperty("pickup_info")
    private PickupInfoVO pickupInfo;
}
