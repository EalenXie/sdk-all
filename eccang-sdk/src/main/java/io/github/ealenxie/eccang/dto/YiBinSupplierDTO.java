package io.github.ealenxie.eccang.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author 无敌暴龙战士
 * @since 2023/1/4 17:55
 */
@Getter
@Setter
public class YiBinSupplierDTO {

    /**
     * 供应商代码：数字字母下划线和中横线最佳
     */
    private String supplierCode;

    /**
     * 名称CN
     */
    private String supplierName;

    /**
     * 等级:A、B、C、D
     */
    private String level;
    /**
     * 组织机构ID【开发中】
     */
    private String supplierOrganizationId;
    /**
     * 合作类型 0：正常 1：临时 2：备用
     */
    private Integer supplierTeamworkType;

    /**
     * 供应商类型：1：零售 2.批发 3.生产商 4.通用虚拟  5.显示  6.市场
     */
    private Integer supplierType;

    /**
     * 支付周期 1.月结 2.隔月结 3.日结 4.周结 5.半月结
     */
    private Integer pcId;

    /**
     * 计算方式：1.货到付款 2.款到发货 3.账期
     */
    private Integer accountType;

    /**
     * 默认支付方式：1.现金 2.在线 3.银行卡
     */
    private Integer payType;

    /**
     * 运输承担方 1.供应商 2.采购方
     */
    private Integer supplierCarrier;

    /**
     * 运输支付方式：当运输承担方为（采购方）时，此项必填（1.到付 2、预付）其他方式时此项不用填
     */
    private Integer supplierShipPayType;

    /**
     * 默认运输方式：1、自提 2、快递 3、物流 4、送货
     */
    private Integer shippingMethodIdHead;

    /**
     * QC不良品处理：1、退货 2、换货 3、采购方承担
     */
    private Integer supplierQcException;

    /**
     * 合同注意事项
     */
    private String supplierTreaty;

    /**
     * 比例值：当结算方式为款到发货时，此项必填。其他方式此项不用必填
     */
    private BigDecimal accountProportion;

    /**
     * 默认运输方式承运商Id：当‘默认运输方式’不为“自提”时，此项必填，从接口 相关接口-&getAllShipper 获取
     */
    private Integer psId;

    /**
     * 名称EN
     */
    private String supplierNameEn;

    /**
     * 默认采购员 用户ID
     */
    private Integer buyerId;

    /**
     * 默认跟单员：用户ID
     */
    private Integer trackId;

    /**
     * 主营品类代码，一级品类代码
     */
    private String supplierMainCategoryCode;

    /**
     * 状态 1：可用 0：做废
     */
    private Integer supplierStatus;

    /**
     * 供应商佣金比例：例如0.03
     */
    private BigDecimal supplierCommissionRatio;

    /**
     * 税率：例如0.15
     */
    private BigDecimal supplierTaxRate;

    /**
     * 合同采购金额
     */
    private BigDecimal purchaseContractAmount;

    /**
     * 店铺网址
     */
    private String supplierWebsite;

    /**
     * 是否网采供应商：0、否 1、是
     */
    private Integer supplierIsNet;
    /**
     * 备注
     */
    private String supplierNote;
    /**
     * 是否备注随供应商带出至采购备注
     * 0-不带出，1-带出
     */
    private Integer syncSupplierNote;
}
