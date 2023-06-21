package io.github.ealenxie.kaufland.v1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/25 11:12
 */
@Getter
@Setter
public class SendingOrdersDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("carrier_code")
    private String carrierCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tracking_number")
    private String trackingNumber;

}
