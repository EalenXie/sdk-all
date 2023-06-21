package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/2/21 15:28
 * @version 1.0
 */
@Getter
@Setter
public class PaymentOperations {
    @JsonProperty("paymentOperations")
    private List<PaymentOperation> paymentOperationList;
    private Integer count;
    private Integer totalCount;
}
