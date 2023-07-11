package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:23
 */
@Getter
@Setter
public class ShipmentIdQueryParams extends PageQueryParams {
    @JsonProperty("shipmentId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipmentId;
}
