package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class PickUpInfo {
    @JsonProperty("expect_pick_up_earliest_time")
    private String expectPickUpEarliestTime;
    @JsonProperty("expect_pick_up_latest_time")
    private String expectPickUpLatestTime;
    @JsonProperty("pick_up_address_info")
    private AddressInfo pickUpAddressInfo;
}
