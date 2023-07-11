package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:17
 */
@Getter
@Setter
public class WFSInventoryLogQueryParams extends PageQueryParams {
    @JsonProperty("gtin")
    private String gtin;
    @JsonProperty("shipmentId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipmentId;
    @JsonProperty("transactionType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transactionType;
    @JsonProperty("transactionLocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transactionLocation;
    @JsonProperty("startDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String startDate;
    @JsonProperty("endDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String endDate;
    @JsonProperty("sort_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;
    @JsonProperty("sort_order")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortOrder;


}
