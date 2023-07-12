package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Qty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 9:54
 * @version 1.0
 */
@Getter
@Setter
public class RefundLine {
    /**
     * returnOrderLineNumber
     */
    @JsonProperty("returnOrderLineNumber")
    private Integer returnOrderLineNumber;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Qty quantity;
}
