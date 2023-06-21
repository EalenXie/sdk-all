package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/15 14:00
 */
@Setter
@Getter
public class ProductItem {
    /**
     * 指定单品货号，国际站无需关注。该字段不一定有值，仅仅在下单时才会把货号记录(如果卖家设置了单品货号的话)。别的订单类型的货号只能通过商品接口去获取。请注意：通过商品接口获取时的货号和下单时的货号可能不一致，因为下单完成后卖家可能修改商品信息，改变了货号。
     */
    private String cargoNumber;
    /**
     * 描述,1688无此信息
     */
    private String description;
    /**
     * 实付金额，单位为元
     */
    private BigDecimal itemAmount;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 原始单价，以元为单位
     */
    private BigDecimal price;
    /**
     * 产品ID（非在线产品为空）
     */
    private Long productID;
    /**
     * 商品图片url
     */
    private List<String> productImgUrl;
    /**
     * 产品快照url，交易订单产生时会自动记录下当时的商品快照，供后续纠纷时参考
     */
    private String productSnapshotUrl;
    /**
     * 以unit为单位的数量，例如多少个、多少件、多少箱、多少吨
     */
    private BigDecimal quantity;
    /**
     * 退款金额，单位为元
     */
    private BigDecimal refund;
    /**
     * skuID
     */
    private Long skuID;
    /**
     * 排序字段，商品列表按此字段进行排序，从0开始，1688不提供
     */
    private Integer sort;
    /**
     * 子订单状态
     */
    private String status;
    /**
     * 子订单号，或商品明细条目ID
     */
    private Long subItemID;
    /**
     * 类型，国际站使用，供卖家标注商品所属类型
     */
    private String type;
    /**
     * 售卖单位 例如：个、件、箱、吨
     */
    private String unit;
    /**
     * 重量 按重量单位计算的重量，例如：100
     */
    private String weight;
    /**
     * 重量单位 例如：g，kg，t
     */
    private String weightUnit;
    /**
     * 保障条款，此字段仅针对1688
     */
    private List<GuaranteesTerm> guaranteesTerms;
    /**
     * 指定商品货号，该字段不一定有值，在下单时才会把货号记录。别的订单类型的货号只能通过商品接口去获取。请注意：通过商品接口获取时的货号和下单时的货号可能不一致，因为下单完成后卖家可能修改商品信息，改变了货号。该字段和cargoNUmber的区别是：该字段是定义在商品级别上的货号，cargoNUmber是定义在单品级别的货号
     */
    private String productCargoNumber;

    private List<SkuInfo> skuInfos;
    /**
     * 订单明细涨价或降价的金额
     */
    private Long entryDiscount;
    /**
     * 订单销售属性ID
     */
    private String specId;
    /**
     * 以unit为单位的quantity精度系数，值为10的幂次，例如:quantityFactor=1000,unit=吨，那么quantity的最小精度为0.001吨
     */
    private BigDecimal quantityFactor;
    /**
     * 子订单状态描述
     */
    private String statusStr;
    /**
     * WAIT_SELLER_AGREE 等待卖家同意 REFUND_SUCCESS 退款成功 REFUND_CLOSED 退款关闭 WAIT_BUYER_MODIFY 待买家修改 WAIT_BUYER_SEND 等待买家退货 WAIT_SELLER_RECEIVE 等待卖家确认收货
     */
    private String refundStatus;
    /**
     * 关闭原因
     */
    private String closeReason;
    /**
     * 1 未发货 2 已发货 3 已收货 4 已经退货 5 部分发货 8 还未创建物流订单
     */
    private Integer logisticsStatus;
    /**
     * 创建时间
     */
    private String gmtCreate;
    /**
     * 修改时间
     */
    private String gmtModified;
    /**
     * 明细完成时间
     */
    private String gmtCompleted;
    /**
     * 库存超时时间，格式为“yyyy-MM-dd HH:mm:ss”
     */
    private String gmtPayExpireTime;
    /**
     * 售中退款单号
     */
    private String refundId;
    /**
     * 子订单号，或商品明细条目ID(字符串类型，由于Long类型的ID可能在JS和PHP中处理有问题，所以可以用字符串类型来处理)
     */
    private String subItemIDString;
    /**
     * 售后退款单号
     */
    private String refundIdForAs;
}
