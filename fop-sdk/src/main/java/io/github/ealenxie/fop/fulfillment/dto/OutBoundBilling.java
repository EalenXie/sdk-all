package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 12:21
 */

@Getter
@Setter
public class OutBoundBilling {

    @JsonProperty("consignment_no")
    private String consignmentNo;
    @JsonProperty("ref_no")
    private String refNo;
}
