package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class ReturnInfo {
    @JsonProperty("isReturnOnDomestic")
    private String isReturnOnDomestic;
    @JsonProperty("domesticReturnAddr")
    private AddressInfo domesticReturnAddr;
    @JsonProperty("isReturnOnOversea")
    private String isReturnOnOversea;
    @JsonProperty("overseaReturnAddr")
    private AddressInfo overseaReturnAddr;
}
