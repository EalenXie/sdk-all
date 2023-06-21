package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class CarrierSubsidies {
    @JsonProperty("subsidy")
    private Amount subsidy;
    @JsonProperty("carrier_name")
    private String carrierName;
}
