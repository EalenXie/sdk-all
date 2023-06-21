package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BillingDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("offer.id")
    private String offerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("order.id")
    private String orderId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("type.id")
    private List<String> typeId;
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
}
