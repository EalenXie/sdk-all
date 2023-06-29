package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 11:15
 */
@Getter
@Setter
public class RefundedPaymentsQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("id")
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("payment.id")
    private String paymentId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("occurredAt.lte")
    private String occurredAtLte;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("occurredAt.gte")
    private String occurredAtGte;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private Integer limit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("offset")
    private Integer offset;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("status")
    private List<String> status;
}
