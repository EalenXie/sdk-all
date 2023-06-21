package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 13:56
 */
@Setter
@Getter
public class StepOrder {
    /**
     * 阶段id
     */
    private Long stepOrderId;
    /**
     * waitactivate 未开始（待激活） waitsellerpush 等待卖家推进 success 本阶段完成 settlebill 分账 cancel 本阶段终止 inactiveandcancel 本阶段未开始便终止 waitbuyerpay 等待买家付款 waitsellersend 等待卖家发货 waitbuyerreceive 等待买家确认收货 waitselleract 等待卖家XX操作 waitbuyerconfirmaction 等待买家确认XX操作
     */
    private String stepOrderStatus;
    /**
     * 1 未冻结/未付款 2 已冻结/已付款 4 已退款 6 已转交易 8 交易未付款被关闭
     */
    private Integer stepPayStatus;
    /**
     * 阶段序列：1、2、3...
     */
    private Integer stepNo;
    /**
     * 是否最后一个阶段
     */
    private Boolean lastStep;
    /**
     * 是否已打款给卖家
     */
    private Boolean hasDisbursed;
    /**
     * 创建时需要付款的金额，不含运费
     */
    private BigDecimal payFee;
    /**
     * 应付款（含运费）= 单价×数量-单品优惠-店铺优惠+运费+修改的金额（除运费外，均指分摊后的金额）
     */
    private BigDecimal actualPayFee;
    /**
     * 本阶段分摊的店铺优惠
     */
    private BigDecimal discountFee;
    /**
     * 本阶段分摊的单品优惠
     */
    private BigDecimal itemDiscountFee;
    /**
     * 本阶段分摊的单价
     */
    private BigDecimal price;
    /**
     * 购买数量
     */
    private Long amount;
    /**
     * 运费
     */
    private BigDecimal postFee;
    /**
     * 修改价格修改的金额
     */
    private BigDecimal adjustFee;
    /**
     * 创建时间
     */
    private String gmtCreate;
    /**
     * 修改时间
     */
    private String gmtModified;
    /**
     * 开始时间
     */
    private String enterTime;
    /**
     * 付款时间
     */
    private String payTime;
    /**
     * 卖家操作时间
     */
    private String sellerActionTime;
    /**
     * 本阶段结束时间
     */
    private String endTime;
    /**
     * 卖家操作留言路径
     */
    private String messagePath;
    /**
     * 卖家上传图片凭据路径
     */
    private String picturePath;
    /**
     * 卖家操作留言
     */
    private String message;
    /**
     * 使用的模板id
     */
    private Long templateId;
    /**
     * 当前步骤的名称
     */
    private String stepName;
    /**
     * 卖家操作名称
     */
    private String sellerActionName;
    /**
     * 买家不付款的超时时间(秒)
     */
    private Long buyerPayTimeout;
    /**
     * 买家不确认的超时时间
     */
    private Long buyerConfirmTimeout;
    /**
     * 是否需要物流
     */
    private Boolean needLogistics;
    /**
     * 是否需要卖家操作和买家确认
     */
    private Boolean needSellerAction;
    /**
     * 阶段结束是否打款
     */
    private Boolean transferAfterConfirm;
    /**
     * 是否需要卖家推进
     */
    private Boolean needSellerCallNext;
    /**
     * 是否允许即时到帐
     */
    private Boolean instantPay;
}
