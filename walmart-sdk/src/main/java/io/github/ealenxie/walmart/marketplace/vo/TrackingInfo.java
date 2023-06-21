package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/04 12:34
 */
@Getter
@Setter
public class TrackingInfo {
    @JsonProperty("carrierName")
    private CarrierName carrierName;
    @JsonProperty("trackingURL")
    private String trackingURL;
    @JsonProperty("shipDateTime")
    private Long shipDateTime;
    @JsonProperty("trackingNumber")
    private String trackingNumber;
    @JsonProperty("methodCode")
    private String methodCode;
}
