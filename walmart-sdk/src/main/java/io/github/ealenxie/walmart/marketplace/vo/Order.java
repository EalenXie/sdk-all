package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    /**
     * 采购订单编号
     */
    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    /**
     * 客户电子邮箱id
     */
    @JsonProperty("customerEmailId")
    private String customerEmailId;
    @JsonProperty("orderLines")
    private OrderLines orderLines;
    @JsonProperty("shipNode")
    private ShipNode shipNode;
    /**
     * 客户订单id
     */
    @JsonProperty("customerOrderId")
    private String customerOrderId;
    @JsonProperty("shippingInfo")
    private ShippingInfo shippingInfo;
    /**
     * 创建订单日期
     */
    @JsonProperty("orderDate")
    private Long orderDate;

}
