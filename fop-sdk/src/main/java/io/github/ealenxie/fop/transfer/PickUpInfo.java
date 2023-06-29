package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class PickUpInfo {
    /**
     * 期望提货最早时间
     * <p>
     * *注：时间传入必须是时间戳
     */
    @JsonProperty("expectPickUpEarliestTime")
    private String expectPickUpEarliestTime;

    /**
     * 期望提货最迟时间
     * <p>
     * *注：时间传入必须是时间戳
     */
    @JsonProperty("expectPickUpLatestTime")
    private String expectPickUpLatestTime;

    /**
     * 收货地址
     */
    @JsonProperty("pickUpAddressInfo")
    private AddressInfo pickUpAddressInfo;
}
