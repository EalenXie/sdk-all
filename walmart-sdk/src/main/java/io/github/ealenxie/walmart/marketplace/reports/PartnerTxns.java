package io.github.ealenxie.walmart.marketplace.reports;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@NoArgsConstructor
@Data
public class PartnerTxns {

    private BigDecimal netPayable;
    private BigDecimal advancePayment;
}
