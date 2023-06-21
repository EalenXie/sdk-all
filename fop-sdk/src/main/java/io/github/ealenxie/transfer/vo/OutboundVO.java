package io.github.ealenxie.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:57
 */
@Getter
@Setter
public class OutboundVO {

    private String deliveryCompanyBarcode;

    private String logisticsChannelName;

    private String weight;

    @JsonProperty("billing_weight")
    private String billingWeight;

    private String weightUnit;

    private String warehouseName;


}
