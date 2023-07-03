package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 10:38
 * @version 1.0
 */
@Setter
@Getter
public class Options {
    /**
     * cashOnDeliveryNotAllowed
     */
    @JsonProperty("cashOnDeliveryNotAllowed")
    private Boolean cashOnDeliveryNotAllowed;
    /**
     * freeAccessoriesReturnRequired
     */
    @JsonProperty("freeAccessoriesReturnRequired")
    private Boolean freeAccessoriesReturnRequired;
    /**
     * refundLoweredByReceivedDiscount
     */
    @JsonProperty("refundLoweredByReceivedDiscount")
    private Boolean refundLoweredByReceivedDiscount;
    /**
     * businessReturnAllowed
     */
    @JsonProperty("businessReturnAllowed")
    private Boolean businessReturnAllowed;
    /**
     * collectBySellerOnly
     */
    @JsonProperty("collectBySellerOnly")
    private Boolean collectBySellerOnly;
    /**
     * abroadReturnTermsMayDiffer
     */
    @JsonProperty("abroadReturnTermsMayDiffer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean abroadReturnTermsMayDiffer;
}
