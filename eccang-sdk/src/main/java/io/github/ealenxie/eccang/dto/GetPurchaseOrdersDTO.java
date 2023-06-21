package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/26 11:25
 */
@Getter
@Setter
public class GetPurchaseOrdersDTO {
    /**
     * 创建类型：0系统生成，1手工创建
     */
    @JsonProperty("create_type")
    private Integer createType;

    /**
     * 仓库ID
     */
    @JsonProperty("warehouse_id")
    private Integer warehouseId;

    /**
     * 头程运输方式：1自提，2快递，3物流，4送货
     */
    @JsonProperty("shipping_method_id_head")
    private Integer shippingMethodIdHead;

    /**
     * 付款状态：0未申请付款，3已申请未付款，1已付款 ，2未付清
     */
    @JsonProperty("pay_status")
    private Integer payStatus;

    /**
     * 采购单状态请求类型：0进入审核流程后，1所有状态（包含待确认），默认0
     */
    @JsonProperty("po_staus_type")
    private Integer poStausType;

    /**
     * 采购单状态：-1审核中，-2复审中，10已确认(供应商反馈)，3已审批(入库在途)，5到货异常，8已完成，9撤销，11已取消(供应商反馈) ('10'、'11'2种状态未开通供应商系统忽略)
     */
    @JsonProperty("po_staus")
    private Integer poStaus;

    /**
     * 系统跟单状态:1-审核，2-在途，3-收货，4-质检，5-上架，6-完成
     */
    @JsonProperty("documentary")
    private Integer documentary;

    /**
     * 采购跟单状态，提供接口getPurchaseTrackStatus查询
     */
    @JsonProperty("pts_status_sort")
    private Integer ptsStatusSort;

    /**
     * 财务跟单状态，提供接口getFinanceTrackStatus查询
     */
    @JsonProperty("fts_status_sort")
    private Integer ftsStatusSort;

    /**
     * 跟单员（用户ID）
     */
    @JsonProperty("pts_oprater")
    private Integer ptsOprater;

    /**
     * 完成类型：0标准，1采购强制完成，2收货强制完成
     */
    @JsonProperty("po_complete_type")
    private Integer poCompleteType;

    /**
     * 收货异常状态：0无异常，1有异常，2处理中，3已完成
     */
    @JsonProperty("receiving_exception_status")
    private Integer receivingExceptionStatus;

    /**
     * QC异常状态：0无异常，1有异常，2处理中，3已完成
     */
    @JsonProperty("qc_exception_status")
    private Integer qcExceptionStatus;

    /**
     * 单号模糊搜索，支持采购单号 跟踪号 参考号 入库单号 网采单号
     */
    @JsonProperty("code_like")
    private String codeLike;

    /**
     * 采购单号（多个）格式：["PO101508120001","PO101508120001"]
     */
    @JsonProperty("po_codes")
    private List<String> poCodes;

    /**
     * 入库单（多个）格式：["R131708240001","R131708240002"]
     */
    @JsonProperty("receiving_codes")
    private List<String> receivingCodes;

    /**
     * 跟踪单号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;

    /**
     * 网采单号
     */
    @JsonProperty("net_number")
    private String netNumber;


    /**
     * 产品搜索类型，1SKU精确搜索，2SKU模糊搜索，3产品名称模糊搜索
     */
    @JsonProperty("sku_type")
    private String skuType;

    /**
     * 产品SKU或产品名称
     */
    @JsonProperty("productCode")
    private String productCode;

    /**
     * 时间搜索类型，createDate创建时间，releaseTime审核时间， etaTime预计到货时间,，expectedTime预计出厂时间，completeTime最近收货时间,
     */
    @JsonProperty("searchDateType")
    private String searchDateType;

    /**
     * 起始时间，格式（下同）：2015-06-01 00:00:00 （需要配合searchDateType参数使用）
     */
    @JsonProperty("dateFor")
    private String dateFor;

    /**
     * 截止时间 （需要配合searchDateType参数使用）
     */
    @JsonProperty("dateTo")
    private String dateTo;
    /**
     * 供应商ID（多个），格式：[1,2,3,4,5]
     */
    @JsonProperty("supplier")
    private List<String> supplier;

    /**
     * 到货：1今日到， 2晚到
     */
    @JsonProperty("etaMark")
    private Integer etaMark;

    /**
     * 采购负责人：1与我相关，2其他
     */
    @JsonProperty("userMark")
    private Integer userMark;

    /**
     * 供应商类型：1零售，2批发，3生产商，4通用虚拟，5线上，6市场
     */
    @JsonProperty("supplier_type")
    private Object supplierType;

    /**
     * 结算方式：1货到付款，2款到发货，3账期
     */
    @JsonProperty("account_type")
    private Integer accountType;
    /**
     * 强制完成状态：0草稿，1确认，2完成
     */
    @JsonProperty("po_forced_status")
    private Integer poForcedStatus;

    /**
     * 在途超期： purchase采购超期，finance财务超期，all采购财务皆超期，none无
     */
    @JsonProperty("onway_later")
    private String onwayLater;

    /**
     * 缺货情况：1缺货
     */
    @JsonProperty("is_no_stock")
    private Integer isNoStock;

    /**
     * 标记到仓：0否，1是
     */
    @JsonProperty("mark_to_warehouse")
    private Integer markToWarehouse;

    /**
     * 签收状态：0否，1是
     */
    @JsonProperty("po_sign_status")
    private Integer poSignStatus;

    /**
     * 补货方式：0缺货入库，1警报入库，2特采入库，3正常入库，4样品采购入库，5备货采购，6试销采购，7返修入库
     */
    @JsonProperty("po_type")
    private Integer poType;

    /**
     * 是否网采：0否，1是
     */
    @JsonProperty("po_is_net")
    private Integer poIsNet;

    /**
     * 是否1688采购单：0否，1是
     */
    @JsonProperty("is1688Purchase")
    private Integer is1688Purchase;

    /**
     * 是否1688下单：0否，1是
     */
    @JsonProperty("po_is_order")
    private Integer poIsOrder;

    /**
     * 排序方式（多个）格式：["date_create desc","po_id desc"]
     */
    @JsonProperty("orderBy")
    private Object orderBy;

    /**
     * 最新备注
     */
    @JsonProperty("track_note")
    private Integer trackNote;

    /**
     * 当前页
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每一页条数，最大1000
     */
    @JsonProperty("pageSize")
    private Integer pageSize;


}
