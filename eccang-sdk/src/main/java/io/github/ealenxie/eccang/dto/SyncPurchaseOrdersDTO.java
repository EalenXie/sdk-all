package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/23 13:35
 */
@Getter
@Setter
public class SyncPurchaseOrdersDTO {
    /**
     * 采购单操作类型 ADD：创建；EDIT：编辑；默认 ADD
     */
    @JsonProperty("action_type")
    private String actionType;
    /**
     * 采购仓库ID
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
    /**
     * 中转仓库ID
     */
    @JsonProperty("to_warehouse_id")
    private Integer toWarehouseId;
    /**
     * 补货方式：
     * 缺货入库0
     * 警报入库1
     * 特采入库2
     * 正常入库3
     * 样品采购入库 4
     * 备货采购5
     * 试销采购6
     * 返修入库 7
     * 如果在系统有维护补货方式则使用系统维护的对应关系
     */
    @JsonProperty("po_type")
    private Integer poType;
    /**
     * 供应商ID
     */
    @JsonProperty("suppiler_id")
    private Integer suppilerId;
    /**
     * 是否退税 0：否 1：是
     */
    @JsonProperty("is_rebate_tax")
    private Integer isRebateTax;
    /**
     * 采购员ID
     */
    @JsonProperty("operator_purchase")
    private Integer operatorPurchase;
    /**
     * 运营方式：
     * 代运营：1
     * 自运营：2
     */
    @JsonProperty("operation_type")
    private Integer operationType;
    /**
     * -	结算方式：
     * 货到付款: 1
     * 款到发货: 2
     * 账期：3
     */
    @JsonProperty("account_type")
    private Integer accountType;
    /**
     * 预付比例(结算方式为款到发货时可选填）
     */
    @JsonProperty("account_proportion")
    private Integer accountProportion;
    /**
     * 是否是1688采购单，0：否1：是。注：1688采购单只能是待确认状态
     */
    @JsonProperty("is_1688")
    private Integer is1688;
    /**
     * 支付周期（beta)
     */
    @JsonProperty("payment_cycle")
    private String paymentCycle;
    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 支付方式：
     * 现金 ：1
     * 在线(支付宝) ：2
     * 银行卡：3
     */
    @JsonProperty("pay_type")
    private String payType;
    /**
     * 供应商收款方式:
     * 现金 ：1
     * 在线(支付宝) ：2
     * 银行卡：3
     */
    @JsonProperty("supplier_pay_type")
    private String supplierPayType;
    /**
     * 供应商运输方式：
     * 自提,1
     * 快递,2
     * 物流,3
     * 送货, 4
     */
    @JsonProperty("shipping_method_id_head")
    private String shippingMethodIdHead;
    /**
     * 支付宝账户(当支付方式为在线时，可选填) ,提供接口getPaymentAccount
     * 查询
     */
    @JsonProperty("alipay_account")
    private String alipayAccount;
    /**
     * 支付银行(当支付方式银行卡时，可选填) ,提供接口getPaymentAccount
     * 查询
     */
    @JsonProperty("bk_id")
    private Integer bkId;
    /**
     * 支付银行卡账号(当支付方式为银行卡时，可选填),提供接口getPaymentAccount
     * 查询
     */
    @JsonProperty("ba_id")
    private Integer baId;
    /**
     * 供应商支付宝账户(当供应商收款方式为在线时，可选填) ,接口getSupplierInfo
     * 查询
     */
    @JsonProperty("alipay_supplier_account")
    private String alipaySupplierAccount;
    /**
     * 收款银行(当供应商收款方式为银行卡时，可选填),接口getSupplierInfo
     * 查询
     */
    @JsonProperty("supplier_bk_id")
    private String supplierBkId;
    /**
     * 支付方式ID(当供应商收款方式为银行卡时，可选填),接口getSupplierInfo
     * 查询 Response.data.paymentAccountList.spmId
     */
    @JsonProperty("supplier_ba_id")
    private Integer supplierBaId;
    /**
     * 跟单员ID
     */
    @JsonProperty("pts_oprater")
    private Integer ptsOprater;
    /**
     * 采购单号，采购单操作类型为1（编辑）时，必填
     */
    @JsonProperty("po_code")
    private String poCode;
    /**
     * 1：待确认，2:待审核，3:已审核    默认值：待确认
     * 解释：待确认：即新建采购单时候的初始状态；
     * 待审核：提交确认了采购单，等待审核；
     * 已审核：即审核通过，变更为采购在途；
     * 采购单操作类型为1（编辑）时，状态只支持 1（待确认）
     */
    @JsonProperty("po_status")
    private Integer poStatus;
    /**
     * 采购公司
     */
    @JsonProperty("company")
    private String company;
    /**
     * 收件人ID
     */
    @JsonProperty("receiver")
    private String receiver;
    /**
     * 跟踪单号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
    /**
     * 参考号
     */
    @JsonProperty("ref_no")
    private String refNo;
    /**
     * 预计到货时间
     */
    @JsonProperty("date_eta")
    private String dateEta;
    /**
     * 运费
     */
    @JsonProperty("pay_ship_amount")
    private BigDecimal payShipAmount;
    /**
     * 支付单号
     */
    @JsonProperty("transaction_no")
    private Integer transactionNo;
    /**
     * 预计出厂时间
     */
    @JsonProperty("date_expected")
    private String dateExpected;
    /**
     * 创建时间，默认当前时间
     */
    @JsonProperty("date_create")
    private String dateCreate;
    /**
     * 是否网采，0
     * 否,1
     * 是，默认0
     */
    @JsonProperty("po_is_net")
    private Integer poIsNet;
    /**
     * 网采单号（可填多个，当是否网采为1时可选填），格式：["101508120001","101508120001"]
     */
    @JsonProperty("single_net_number")
    private String singleNetNumber;
    /**
     * 采购是否含税   0：否 1：是
     */
    @JsonProperty("po_is_has_tax")
    private Integer poIsHasTax;
    /**
     * 组织机构Id
     */
    @JsonProperty("organization_id")
    private String organizationId;
    /**
     * 申购单号（分销系统用）
     */
    @JsonProperty("pro_code")
    private String proCode;
    /**
     *
     */
    @JsonProperty("productList")
    private List<ProductListDTO> productListDTO;


}
