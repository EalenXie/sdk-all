package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@NoArgsConstructor
@Data
public class TransactionDetails {
    /**
     * saleAggregate
     */
    @JsonProperty("saleAggregate")
    private SaleAggregate saleAggregate;
    /**
     * refundDetails
     */
    @JsonProperty("refundDetails")
    private RefundDetails refundDetails;
    /**
     * adjustmentAggregate
     */
    @JsonProperty("adjustmentAggregate")
    private AdjustmentAggregate adjustmentAggregate;
    /**
     * wfs
     */
    @JsonProperty("wfs")
    private Wfs wfs;
    /**
     * partnerTxns
     */
    @JsonProperty("partnerTxns")
    private PartnerTxns partnerTxns;
}
