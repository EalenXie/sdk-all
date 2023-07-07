package io.github.ealenxie.walmart.marketplace.reports;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@Getter
@Setter
public class PartnerTxns {

    private BigDecimal netPayable;
    private BigDecimal advancePayment;
}
