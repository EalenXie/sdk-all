package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/26 17:26
 */
@Getter
@Setter
public class GetPurchaseOrdersVO {

    /**
     * 最新备注
     */
    @JsonProperty("track_note")
    private String trackNote;
    /**
     * 完成类型：0标准，1采购强制完成，2收货强制完成
     */
    @JsonProperty("po_complete_type")
    private Integer poCompleteType;
    /**
     * 文档未写字段
     */
    @JsonProperty("supplier_carrier")
    private Integer supplierCarrier;
    /**
     * 文档未写字段
     */
    @JsonProperty("level")
    private String level;
    /**
     * 文档未写字段
     */
    @JsonProperty("pro_code")
    private String proCode;
    /**
     * 文档未写字段
     */
    @JsonProperty("create_id")
    private String createId;

    /**
     * 文档未写字段
     */
    @JsonProperty("tags")
    private String tags;

    /**
     * 文档未写字段
     */
    @JsonProperty("eta_log")
    private String etaLog;


    /**
     * 采购单Id
     */
    @JsonProperty("po_id")
    private Integer poId;

    /**
     * 采购单号
     */
    @JsonProperty("po_code")
    private String poCode;

    /**
     * 仓库Id
     */
    @JsonProperty("warehouse_id")
    private Integer warehouseId;

    /**
     * 头程运输方式
     */
    @JsonProperty("shipping_method_id_head")
    private Integer shippingMethodIdHead;

    /**
     * 跟踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;

    /**
     * 参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 供应商Id
     */
    @JsonProperty("suppiler_id")
    private Integer suppilerId;

    /**
     * 总应付金额
     */
    @JsonProperty("payable_amount")
    private BigDecimal payableAmount;

    /**
     * 总实付金额
     */
    @JsonProperty("actually_amount")
    private BigDecimal actuallyAmount;

    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;

    /**
     * 付款状态：0未申请付款，3已申请未付款，1已付款 ，2未付清
     */
    @JsonProperty("pay_status")
    private Integer payStatus;

    /**
     * 采购单状态：10已确认(供应商反馈)，1待确认，2审核中，3已审批(入库在途)，
     * 5到货异常，8已完成，9撤销，11已取消(供应商反馈) ('10'、'11'2种状态未开通供应商系统忽略)
     */
    @JsonProperty("po_staus")
    private Integer poStaus;

    /**
     * 组织机构id
     */
    @JsonProperty("user_organization_id")
    private Integer userOrganizationId;

    /**
     * 组织机构名称
     */
    @JsonProperty("user_organization_name")
    private String userOrganizationName;

    /**
     * 创建时间
     */
    @JsonProperty("date_create")
    private String dateCreate;

    /**
     * 预计到货时间
     */
    @JsonProperty("date_eta")
    private String dateEta;

    /**
     * 审核时间
     */
    @JsonProperty("date_release")
    private String dateRelease;

    /**
     * 采购单完成时间
     */
    @JsonProperty("po_completion_time")
    private String poCompletionTime;

    /**
     * 中转仓库Id
     */
    @JsonProperty("to_warehouse_id")
    private Integer toWarehouseId;

    /**
     * 收货异常：0没有异常、1收货异常、2QC异常 3收货&质检异常
     */
    @JsonProperty("receiving_exception")
    private Integer receivingException;

    /**
     * 采购员（用户ID）
     */
    @JsonProperty("operator_purchase")
    private Integer operatorPurchase;

    /**
     * 收货异常是否已经处理 0无、1没有处理、2已经处理
     */
    @JsonProperty("receiving_exception_handle")
    private Integer receivingExceptionHandle;

    /**
     * 采购单是否通过审批，未通过或通过
     */
    @JsonProperty("return_verify")
    private String returnVerify;

    /**
     * 运输金额
     */
    @JsonProperty("pay_ship_amount")
    private BigDecimal payShipAmount;

    /**
     * 建立方式，0系统生成，1人工建立
     */
    @JsonProperty("create_type")
    private Integer createType;

    /**
     * 跟单状态序号
     */
    @JsonProperty("pts_status_sort")
    private String ptsStatusSort;

    /**
     * 结算方式
     */
    @JsonProperty("account_type")
    private Integer accountType;

    /**
     * 预付比例
     */
    @JsonProperty("account_proportion")
    private Integer accountProportion;

    /**
     * 支付周期
     */
    @JsonProperty("payment_cycle_type")
    private String paymentCycleType;

    /**
     * 跟单员（用户ID）
     */
    @JsonProperty("pts_oprater")
    private Integer ptsOprater;

    /**
     * 交易支付单号，如淘宝交易号
     */
    @JsonProperty("transaction_no")
    private String transactionNo;

    /**
     * 采购单承运商ID
     */
    @JsonProperty("ps_id")
    private Integer psId;

    /**
     * 备注
     */
    @JsonProperty("po_remark")
    private String poRemark;

    /**
     * 收货异常状态
     */
    @JsonProperty("receiving_exception_status")
    private Integer receivingExceptionStatus;

    /**
     * 质检异常状态
     */
    @JsonProperty("qc_exception_status")
    private Integer qcExceptionStatus;

    /**
     * 供应商名称(URLEncode后的)
     */
    @JsonProperty("supplier_name")
    private String supplierName;

    /**
     * 供应商代码
     */
    @JsonProperty("supplier_code")
    private String supplierCode;

    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 仓库描述(URLEncode后的)
     */
    @JsonProperty("warehouse_desc")
    private String warehouseDesc;

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;

    /**
     * 是否是审核未通过，回退的采购单 0否 1是
     */
    @JsonProperty("verify")
    private Integer verify;

    /**
     * 到货（1今日到 2晚到）
     */
    @JsonProperty("mark_eta")
    private Integer markEta;

    /**
     * 跟单员
     */
    @JsonProperty("pts_name")
    private String ptsName;

    /**
     * 承运商名称（ps_id为0时不返回）
     */
    @JsonProperty("ps_name")
    private String psName;

    /**
     * 承运商网址（ps_id为0时不返回）
     */
    @JsonProperty("ps_url")
    private String psUrl;

    /**
     * 最新的采购单跟踪备注
     */
    @JsonProperty("pt_note")
    private String ptNote;

    /**
     * 最新的采购单跟踪备注时间
     */
    @JsonProperty("pt_add_time")
    private String ptAddTime;

    /**
     * 预期总数
     */
    @JsonProperty("qty_expected_all")
    private Integer qtyExpectedAll;

    /**
     * 实到总数
     */
    @JsonProperty("qty_receving_all")
    private Integer qtyRecevingAll;

    /**
     * 跟踪号数量
     */
    @JsonProperty("trackings")
    private Integer trackings;

    /**
     * 是否网采：0否，1是
     */
    @JsonProperty("po_is_net")
    private Integer poIsNet;

    /**
     * 支付方式，1现金、2在线，3银行账号
     */
    @JsonProperty("pay_type")
    private Integer payType;

    /**
     * 银行名称，支付方式为银行账号时返回(URLEncode后的)
     */
    @JsonProperty("bank_name")
    private String bankName;

    /**
     * 支付账户
     */
    @JsonProperty("pay_account")
    private String payAccount;

    /**
     * 预期总金额
     */
    @JsonProperty("sum_amount")
    private BigDecimal sumAmount;

    /**
     * 预计出厂时间
     */
    @JsonProperty("date_expected")
    private String dateExpected;

    /**
     * 补货方式：0缺货入库，1警报入库，2特采入库，3正常入库，4样品采购入库，5备货采购，6试销采购，7返修入库
     */
    @JsonProperty("po_type")
    private Integer poType;

    /**
     * 网采单号（多个）格式：["1111111","222222"]
     */
    @JsonProperty("single_net_number")
    private Object singleNetNumber;

    /**
     * 税费
     */
    @JsonProperty("total_tax_fee")
    private BigDecimal totalTaxFee;

    /**
     * 采购单跟单状态
     */
    @JsonProperty("track")
    private TrackVO track;

    /**
     * 系统跟单状态
     */
    @JsonProperty("systemTrack")
    private Object systemTrack;

    /**
     * 采购明细
     */
    @JsonProperty("detail")
    private List<DetailVO> detail;

    /**
     * 采购审核备注
     */
    @JsonProperty("payment_note")
    private String paymentNote;

    /**
     * 采购公司
     */
    @JsonProperty("company")
    private String company;

    /**
     * 创建人
     */
    @JsonProperty("operator_create")
    private String operatorCreate;


}
