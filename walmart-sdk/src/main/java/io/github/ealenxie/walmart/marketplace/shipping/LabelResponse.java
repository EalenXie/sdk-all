package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 10:41
 */
@NoArgsConstructor
@Data
public class LabelResponse {


    /**
     * purchaseOrderId
     */
    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * boxItems
     */
    @JsonProperty("boxItems")
    private List<BoxItem> boxItems;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * carrierFullName
     */
    @JsonProperty("carrierFullName")
    private String carrierFullName;
    /**
     * carrierServiceType
     */
    @JsonProperty("carrierServiceType")
    private String carrierServiceType;
    /**
     * trackingUrl
     */
    @JsonProperty("trackingUrl")
    private String trackingUrl;
}
