package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 11:18
 */
@Getter
@Setter
public class RefundedPaymentsResponse {

    /**
     * refunds
     */
    @JsonProperty("refunds")
    private List<Refund> refunds;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
