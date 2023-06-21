package io.github.ealenxie.grs.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/27 11:21
 */
@Getter
@Setter
public class ReceivedInfo {

    @JsonProperty("countSkuList")
    private List<Sku> countSkuList;
    @JsonProperty("received_weight")
    private String receivedWeight;
    @JsonProperty("is_normal")
    private String isNormal;
    @JsonProperty("received_time")
    private String receivedTime;
    @JsonProperty("inventory_shelf_time")
    private String inventoryShelfTime;
    @JsonProperty("rma_no")
    private String rmaNo;
    @JsonProperty("received_shipping_no")
    private String receivedShippingNo;
    @JsonProperty("reference_no")
    private String referenceNo;
    @JsonProperty("status")
    private String status;
    @JsonProperty("second_strategy_time")
    private String secondStrategyTime;
}
