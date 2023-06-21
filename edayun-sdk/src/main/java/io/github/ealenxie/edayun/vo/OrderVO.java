package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.edayun.dto.ShipmentInfo;
import io.github.ealenxie.edayun.dto.ShippingAddress;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class OrderVO {
    /**
     * 订单类型
     */
    @JsonProperty("OrderType")
    private String orderType;
    /**
     * Omni订单号
     */
    private String businessNum;
    /**
     * 卖家订单号
     */
    private String poNumber;
    /**
     * 订单类型
     */
    private String type;
    /**
     * 订单生成日期
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    private Date orderDate;
    /**
     * 订单支付日期
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    private Date paidDate;
    /**
     * 发货日期
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    private Date shippedDate;
    /**
     * 寄件类型
     */
    private String fulfilment;
    /**
     * 订单状态
     */
    private String orderStatus;
    /**
     * 买家邮箱
     */
    private String buyerEmail;
    /**
     * 买家姓名
     */
    private String buyerName;
    /**
     * 订单的货币类型
     */
    private String currency;
    /**
     * 总费用
     */
    private Double orderTotal;
    /**
     * 运费币种
     */
    private String shippingCostCurrency;
    /**
     * 运费
     */
    private Double shippingCost;
    /**
     * 计费项详情，暂无数据返回
     */
    private List<ShippingCostDetail> shippingCostDetails;
    /**
     * 预估费用
     */
    private Double evalueDeliveryCost;
    /**
     * 派送方式
     */
    private String shippingService;
    /**
     * 备注
     */
    private String note;
    /**
     * 卖家邮箱
     */
    private String sellerEmail;
    /**
     * 产品详情
     */
    private List<ProductItem> itemDetails;
    /**
     * 收件人地址信息
     */
    private ShippingAddress shippingAddress;
    /**
     * 寄件人信息
     */
    private ShippingAddress sellerAddress;

    // 账单信息
    private Object billingAddress;

    private List<ShipmentInfo> shipmentInfos;

}


