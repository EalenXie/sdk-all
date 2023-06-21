package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/26 9:12
 */
@Getter
@Setter
public class GetSupplierListVO {

    /**
     * 供应商Id
     */
    @JsonProperty("supplierId")
    private String supplierId;

    /**
     * 供应商代码：数字字母下划线和中横线最佳
     */
    @JsonProperty("supplierCode")
    private String supplierCode;

    /**
     * 名称CN
     */
    @JsonProperty("supplierName")
    private String supplierName;

    /**
     * 等级
     */
    @JsonProperty("level")
    private String level;

    /**
     * 合作类型
     */
    @JsonProperty("supplierTeamworkType")
    private Integer supplierTeamworkType;

    /**
     * 供应商类型：1零售、2批发、3生产商、4通用虚拟、5显示、6市场 (0：表示为填写)
     */
    @JsonProperty("supplierType")
    private Integer supplierType;

    /**
     * 组织机构ID
     */
    @JsonProperty("supplierOrganizationId")
    private Integer supplierOrganizationId;

    /**
     * 支付周期类型：1月结、2隔月结、3日结、4周结、5半月结 (0：表示为填写)
     */
    @JsonProperty("pcId")
    private Integer pcId;

    /**
     * 结算方式：1货到付款、2款到发货、3帐期
     */
    @JsonProperty("accountType")
    private Integer accountType;

    /**
     * 默认支付方式：1现金、2在线、3银行卡
     */
    @JsonProperty("payType")
    private Integer payType;

    /**
     * 运输承担方：1供应商、2采购方
     */
    @JsonProperty("supplierCarrier")
    private Integer supplierCarrier;

    /**
     * 运输支付方式： 1预付、2到付
     */
    @JsonProperty("supplierShipPayType")
    private Integer supplierShipPayType;

    /**
     * 默认运输方式：1自提、2快递、3物流、4送货
     */
    @JsonProperty("shippingMethodIdHead")
    private Integer shippingMethodIdHead;

    /**
     * QC不良品处理：1退货、2换货、3采购方承担
     */
    @JsonProperty("supplierQcException")
    private Integer supplierQcException;

    /**
     * -	合同注意事项
     */
    @JsonProperty("supplierTreaty")
    private String supplierTreaty;

    /**
     * 比例值
     */
    @JsonProperty("accountProportion")
    private BigDecimal accountProportion;
    /**
     * 名称EN
     */
    @JsonProperty("supplierNameEn")
    private String supplierNameEn;

    /**
     * 默认采购员
     */
    @JsonProperty("buyerId")
    private Integer buyerId;

    /**
     * 默认跟单员
     */
    @JsonProperty("trackId")
    private Integer trackId;

    /**
     * 状态：0正式供应商，1草稿，2待审核，3暂停供应商
     */
    @JsonProperty("supplierStatus")
    private Integer supplierStatus;

    /**
     * 供应商佣金比例：例如0.03
     */
    @JsonProperty("supplierCommissionRatio")
    private BigDecimal supplierCommissionRatio;

    /**
     * 合同采购金额
     */
    @JsonProperty("purchaseContractAmount")
    private BigDecimal purchaseContractAmount;

    /**
     * 支付账户数据
     */
    @JsonProperty("paymentAccountList")
    private List<PaymentAccountListVO> paymentAccountList;

    /**
     * 联系方式数据
     */
    @JsonProperty("contactList")
    private List<ContactListVO> contactList;

    /**
     * 附属图片URL数据
     */
    @JsonProperty("supplierImagesList")
    private List<GetSupplierImageListVO> supplierImagesList;

    /**
     * 默认运输方式承运商Id
     */
    @JsonProperty("psid")
    private String psId;

    /**
     * 主营品类id
     */
    @JsonProperty("supplierMainCategoryId")
    private String supplierMainCategoryId;

}
