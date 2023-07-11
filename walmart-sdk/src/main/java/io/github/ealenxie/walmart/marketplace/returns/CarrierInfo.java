package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class CarrierInfo {
    /**
     * carrierId
     */
    @JsonProperty("carrierId")
    private String carrierId;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * serviceType
     */
    @JsonProperty("serviceType")
    private String serviceType;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
}
