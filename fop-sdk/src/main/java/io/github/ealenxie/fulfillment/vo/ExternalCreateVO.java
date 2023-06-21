package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 14:48
 */
@Getter
@Setter
public class ExternalCreateVO {

    @JsonProperty("consignment_no")
    private String consignmentNo;
}
