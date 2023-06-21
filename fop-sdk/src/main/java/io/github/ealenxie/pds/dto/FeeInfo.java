package io.github.ealenxie.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:47
 */
@Getter
@Setter
public class FeeInfo {
    @JsonProperty("feeCollectionPayment")
    private Integer feeCollectionPayment;
    @JsonProperty("feeDelivery")
    private Integer feeDelivery;
    @JsonProperty("feeUnit")
    private String feeUnit;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("paymentType")
    private String paymentType;
}
