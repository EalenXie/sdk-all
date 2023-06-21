package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class CreateOrderDTO {
    /**
     * 平台订单号(必填)
     */
    private String poNumber;
    /**
     * 货币单位
     */
    private String currency;
    /**
     * 订单总价
     */
    private BigDecimal orderTotal;
    /**
     * 默认是false,此字段为后期扩展用
     */

    @JsonProperty("IsChecked")
    private Boolean isChecked;
    /**
     * 仓库ID，在接口listPublicWarehouseInfo中获取(必填)
     */
    private Integer warehouseId;
    /**
     * 物流ID，在接口listWarehouseCourierInfo中获取(必填)
     */
    private Integer courierAccountId;
    /**
     * 订单所属的平台来源，填写英文字符如：amazon、ebay、aliexpress
     */
    private String platform;
    /**
     * 要求发货时间  这个时间暂时不用
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    private Date expectDate;
    /**
     * 订单备注
     */
    private String orderNode;
    /**
     * 签收服务，使用签收服务值为true
     */
    private Boolean isSignature;
    /**
     * 收件人地址信息
     */
    private ShippingAddress shippingAddress;
    /**
     * 订单中的平台产品所有信息的集合
     */
    private List<Item> items;
    /**
     * VC/VE订单的面单信息
     * （当物流产品为VC/VE物流时必填）
     */
    private LabelInfo labelInfo;
}