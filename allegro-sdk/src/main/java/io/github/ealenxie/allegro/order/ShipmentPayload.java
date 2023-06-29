package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/16 10:48
 */
@Getter
@Setter
public class ShipmentPayload {


    /**
     * 运营商id
     */
    @JsonProperty("carrierId")
    private String carrierId;
    /**
     * 运单号
     */
    @JsonProperty("waybill")
    private String waybill;
    /**
     * 运营商名称
     */
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * 订单列表
     */
    @JsonProperty("lineItems")
    private List<IdPayload> lineItems;


}
