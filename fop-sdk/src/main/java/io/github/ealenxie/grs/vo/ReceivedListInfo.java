package io.github.ealenxie.grs.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/2 12:39
 */

@Getter
@Setter
public class ReceivedListInfo {


    @JsonProperty("received_shipping_no")
    private String receivedShippingNo;
    @JsonProperty("received_time")
    private String receivedTime;
    @JsonProperty("received_weight")
    private String receivedWeight;
    @JsonProperty("reference_no")
    private String referenceNo;
    @JsonProperty("rma_no")
    private String rmaNo;
    @JsonProperty("status")
    private String status;
    @JsonProperty("warehouse")
    private String warehouse;
}
