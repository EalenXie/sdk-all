package io.github.ealenxie.fop.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:47
 */
@Getter
@Setter
public class FeeInfo {
    /**
     * 代收货款
     */
    @JsonProperty("feeCollectionPayment")
    private Integer feeCollectionPayment;

    /**
     * 运费
     */
    @JsonProperty("feeDelivery")
    private Integer feeDelivery;

    /**
     * 价格单位
     */
    @JsonProperty("feeUnit")
    private String feeUnit;

    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 运费付费方式：
     * <p>
     * 到付 CONSIGNEE_PAY
     * <p>
     * 寄付 SENDER_PAY
     * <p>
     * 月结 MONTHLY_PAY
     */
    @JsonProperty("paymentType")
    private String paymentType;
}
