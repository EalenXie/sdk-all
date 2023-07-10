package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 13:56
 */
@Getter
@Setter
public class InboundShipmentsQueryParams extends PageQueryParams {
    @JsonProperty("inboundOrderId")
    private String inboundOrderId;
    @JsonProperty("shipmentId")
    private String shipmentId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("fromCreateDate")
    private String fromCreateDate;
    @JsonProperty("toCreateDate")
    private String toCreateDate;
}
