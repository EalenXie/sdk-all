package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class PickUpInfo {

    /**
     * 期望提货最早时间
     * <p>
     * *注：时间格式的传入值需要转换为long类型格式。
     */
    @JsonProperty("expect_pick_up_earliest_time")
    private String expectPickUpEarliestTime;

    /**
     * 期望提货最迟时间
     * <p>
     * *注：时间格式的传入值需要转换为long类型格式。
     */
    @JsonProperty("expect_pick_up_latest_time")
    private String expectPickUpLatestTime;

    /**
     * 收货地址
     */
    @JsonProperty("pick_up_address_info")
    private AddressInfo pickUpAddressInfo;
}
