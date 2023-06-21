package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/15 13:53
 */
@Setter
@Getter
public class BaseInfo {
    /**
     * 完全发货时间
     */
    private String allDeliveredTime;
    /**
     * 卖家诚信等级
     */
    private String sellerCreditLevel;
    /**
     * 付款时间，如果有多次付款，这里返回的是首次付款时间
     */
    private String payTime;
    /**
     * 折扣信息，单位分
     */
    private Long discount;
    /**
     * 外部支付交易Id
     */
    private String alipayTradeId;
    /**
     * 产品总金额(该订单产品明细表中的产品金额的和)，单位元
     */
    private BigDecimal sumProductPayment;
    /**
     * 买家留言，不超过500字
     */
    private String buyerFeedback;
    /**
     * 4.0交易流程模板code
     */
    private String flowTemplateCode;
    /**
     * 是否自主订单（邀约订单）
     */
    private Boolean sellerOrder;
    /**
     * 买家loginId，旺旺Id
     */
    private String buyerLoginId;
    /**
     * 修改时间
     */
    private String modifyTime;
    /**
     * 买家子账号
     */
    private String subBuyerLoginId;
    /**
     * 交易id
     */
    private Long id;
    /**
     * 关闭原因。buyerCancel:买家取消订单，sellerGoodsLack:卖家库存不足，other:其它
     */
    private String closeReason;
    /**
     * 买家联系人
     */
    private BuyerContact buyerContact;
    /**
     * 卖家支付宝id
     */
    private String sellerAlipayId;
    /**
     * 完成时间
     */
    private String completeTime;
    /**
     * 卖家oginId，旺旺Id
     */
    private String sellerLoginId;
    /**
     * 买家主账号id
     */
    private String buyerID;
    /**
     * 关闭订单操作类型。CLOSE_TRADE_BY_SELLER:卖家关闭交易,CLOSE_TRADE_BY_BOPS:BOPS后台关闭交易,CLOSE_TRADE_BY_SYSTEM:系统（超时）关闭交易,CLOSE_TRADE_BY_BUYER:买家关闭交易,CLOSE_TRADE_BY_CREADIT:诚信保障投诉关闭
     */
    private String closeOperateType;
    /**
     * 应付款总金额，totalAmount = ∑itemAmount + shippingFee，单位为元
     */
    private BigDecimal totalAmount;
    /**
     * 卖家主账号id
     */
    private String sellerID;
    /**
     * 运费，单位为元
     */
    private BigDecimal shippingFee;
    /**
     * 买家数字id
     */
    private Long buyerUserId;
    /**
     * 买家备忘信息
     */
    private String buyerMemo;
    /**
     * 退款金额，单位为元
     */
    private BigDecimal refund;
    /**
     * 交易状态，
     * waitbuyerpay:等待买家付款;
     * waitsellersend:等待卖家发货;
     * waitbuyerreceive:等待买家收货;
     * confirm_goods:已收货;
     * success:交易成功;
     * cancel:交易取消;
     * terminated:交易终止;
     * 未枚举:其他状态
     */
    private String status;
    /**
     * 退款金额
     */
    private Long refundPayment;
    /**
     * 卖家联系人信息
     */
    private SellerContact sellerContact;
    /**
     * 红包金额，实付金额（totalAmount）已经计算过红包金额
     */
    private BigDecimal couponFee;
    /**
     * 买家备忘标志
     */
    private String buyerRemarkIcon;
    /**
     * 收件人信息
     */
    private ReceiverInfo receiverInfo;
    /**
     * 订单的售中退款状态，等待卖家同意：waitselleragree ，待买家修改：waitbuyermodify，等待买家退货：waitbuyersend，等待卖家确认收货：waitsellerreceive，退款成功：refundsuccess，退款失败：refundclose
     */
    private String refundStatus;
    /**
     * 备注，1688指下单时的备注
     */
    private String remark;
    /**
     * 预订单ID
     */
    private Long preOrderId;
    /**
     * 确认时间
     */
    private String confirmedTime;
    /**
     * 关闭订单备注
     */
    private String closeRemark;
    /**
     * 1:担保交易 2:预存款交易 3:ETC境外收单交易 4:即时到帐交易 5:保障金安全交易 6:统一交易流程 7:分阶段付款 8.货到付款交易 9.信用凭证支付交易 10.账期支付交易，50060 交易4.0
     */
    private String tradeType;
    /**
     * 收货时间，这里返回的是完全收货时间
     */
    private String receivingTime;
    /**
     * 分阶段法务协议地址
     */
    private String stepAgreementPath;
    /**
     * 交易id(字符串格式)
     */
    private String idOfStr;
    /**
     * 订单的售后退款状态
     */
    private String refundStatusForAs;
    /**
     * 是否一次性付款
     */
    private Boolean stepPayAll;
    /**
     * 卖家数字id
     */
    private Long sellerUserId;
    /**
     * [交易3.0]分阶段交易，分阶段订单list
     */
    private List<StepOrder> stepOrderList;
    /**
     * 买家支付宝id
     */
    private String buyerAlipayId;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 业务类型。国际站：ta(信保),wholesale(在线批发)。 中文站：普通订单类型 = "cn"; 大额批发订单类型 = "ws"; 普通拿样订单类型 = "yp"; 一分钱拿样订单类型 = "yf"; 倒批(限时折扣)订单类型 = "fs"; 加工定制订单类型 = "cz"; 协议采购订单类型 = "ag"; 伙拼订单类型 = "hp"; 供销订单类型 = "supply"; 淘工厂订单 = "factory"; 快订下单 = "quick"; 享拼订单 = "xiangpin"; 当面付 = "f2f"; 存样服务 = "cyfw"; 代销订单 = "sp"; 微供订单 = "wg";零售通 = "lst";跨境='cb';分销='distribution';采源宝='cab';加工定制="manufact"
     */
    private String businessType;
    /**
     * 是否海外代发订单，是：true
     */
    private Boolean overSeaOrder;
    /**
     * 退款单ID
     */
    private String refundId;
    /**
     * 下单时指定的交易方式
     */
    private String tradeTypeDesc;
    /**
     * 支付渠道名称列表。一笔订单可能存在多种支付渠道。枚举值：支付宝,网商银行信任付,诚e赊,对公转账,赊销宝,账期支付,合并支付渠道,支付平台,声明付款,网商电子银行承兑汇票,银行转账,跨境宝,红包,其它
     */
    private List<String> payChannelList;
    /**
     * 下单时指定的交易方式tradeType
     */
    private String tradeTypeCode;
    /**
     * 支付超时时间，定长情况时单位：秒，目前都是定长
     */
    private Long payTimeout;
    /**
     * 支付超时TYPE，0：定长，1：固定时间
     */
    private Integer payTimeoutType;
}
