package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/7 10:27
 */
@NoArgsConstructor
@Data
public class DayReportPayload {
    /**
     * refundRateSellerFault
     */
    @JsonProperty("refundRateSellerFault")
    private BigDecimal refundRateSellerFault;
    /**
     * refundRateCustomerFault
     */
    @JsonProperty("refundRateCustomerFault")
    private BigDecimal refundRateCustomerFault;
    /**
     * ots
     */
    @JsonProperty("ots")
    private BigDecimal ots;
    /**
     * otd
     */
    @JsonProperty("otd")
    private BigDecimal otd;
    /**
     * vtr
     */
    @JsonProperty("vtr")
    private BigDecimal vtr;
    /**
     * cancellationSellerFault
     */
    @JsonProperty("cancellationSellerFault")
    private BigDecimal cancellationSellerFault;
    /**
     * cancellationCustomerFault
     */
    @JsonProperty("cancellationCustomerFault")
    private BigDecimal cancellationCustomerFault;
}
