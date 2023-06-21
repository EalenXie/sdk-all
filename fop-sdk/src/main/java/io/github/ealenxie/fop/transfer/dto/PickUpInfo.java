package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class PickUpInfo {
    @JsonProperty("expectPickUpEarliestTime")
    private String expectPickUpEarliestTime;
    @JsonProperty("expectPickUpLatestTime")
    private String expectPickUpLatestTime;
    @JsonProperty("pickUpAddressInfo")
    private AddressInfo pickUpAddressInfo;
}
