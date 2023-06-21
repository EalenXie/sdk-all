package io.github.ealenxie.fruugo.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/10 12:27
 */
@Getter
@Setter
public class Shipment {
    /**
     * 货件编号
     */
    private String shipmentId;
    /**
     * 发货日期
     */
    private String shippingDate;
    /**
     * shipmentLines
     */
    private ShipmentLines shipmentLines;
}
