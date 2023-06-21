package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class ReturnInfo {
    @JsonProperty("is_return_on_domestic")
    private String isReturnOnDomestic;
    @JsonProperty("domestic_return_addr")
    private AddressInfo domesticReturnAddr;
    @JsonProperty("is_return_on_oversea")
    private String isReturnOnOversea;
    @JsonProperty("oversea_return_addr")
    private AddressInfo overseaReturnAddr;
}
