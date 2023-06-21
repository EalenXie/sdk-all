package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.shopify.vo.LineItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie
 * @since 2022/08/29 9:24
 */
@Getter
@Setter
public class FulfillmentShipDTO {
    @JsonProperty("location_id")
    private Long locationId;
    /**
     * 运输公司的编号
     **/
    @JsonProperty("tracking_number")
    private String trackingNumber;

    @JsonProperty("line_items")
    private List<LineItem> lineItems;
}
