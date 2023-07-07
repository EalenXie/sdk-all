package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@NoArgsConstructor
@Data
public class AdjustmentAggregate {

    /**
     * netPayable
     */
    @JsonProperty("netPayable")
    private BigDecimal netPayable;
    /**
     * returnShipServCharge
     */
    @JsonProperty("returnShipServCharge")
    private BigDecimal returnShipServCharge;
    /**
     * disputeSettlement
     */
    @JsonProperty("disputeSettlement")
    private BigDecimal disputeSettlement;
    /**
     * returnHandlingServCharge
     */
    @JsonProperty("returnHandlingServCharge")
    private BigDecimal returnHandlingServCharge;
    /**
     * fwdShippingServiceFee
     */
    @JsonProperty("fwdShippingServiceFee")
    private BigDecimal fwdShippingServiceFee;


}
