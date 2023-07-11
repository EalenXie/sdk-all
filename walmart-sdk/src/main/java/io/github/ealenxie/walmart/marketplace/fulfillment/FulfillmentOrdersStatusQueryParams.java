package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:08
 */
@Getter
@Setter
public class FulfillmentOrdersStatusQueryParams extends PageQueryParams {
    @JsonProperty("orgId")
    private String orgId;
    @JsonProperty("orderNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderNumber;
    @JsonProperty("trackingNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingNumber;
    @JsonProperty("shipmentNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipmentNumber;
    @JsonProperty("fromOrderDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fromOrderDate;
    @JsonProperty("toOrderDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String toOrderDate;
    @JsonProperty("sortOrder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortOrder;
    @JsonProperty("sortBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;

}
