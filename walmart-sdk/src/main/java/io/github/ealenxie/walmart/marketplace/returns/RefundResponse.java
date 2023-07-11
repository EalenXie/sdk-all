package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/11 9:58
 * @version 1.0
 */
@Getter
@Setter
public class RefundResponse {

    /**
     * returnOrderId
     */
    @JsonProperty("returnOrderId")
    private String returnOrderId;
    /**
     * customerOrderId
     */
    @JsonProperty("customerOrderId")
    private String customerOrderId;
    /**
     * refundLines
     */
    @JsonProperty("refundLines")
    private List<RefundLine> refundLines;
}
