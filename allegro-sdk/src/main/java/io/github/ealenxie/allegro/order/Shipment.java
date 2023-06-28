package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/16 10:51
 */
@Getter
@Setter
public class Shipment {

    /**
     * 货物标识号
     */
    @JsonProperty("id")
    private String id;
    /**
     * 运单号
     */
    @JsonProperty("waybill")
    private String waybill;
    /**
     * 运营商id
     */
    @JsonProperty("carrierId")
    private String carrierId;
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
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
}
