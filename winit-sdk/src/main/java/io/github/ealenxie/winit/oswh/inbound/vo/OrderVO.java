package io.github.ealenxie.winit.oswh.inbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/2/3 13:30
 **/
@Getter
@Setter
public class OrderVO {
    /**
     * WINIT订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 订单类型
     * SD-标准海外仓入库
     * DW-直发海外验入库
     * DI-直发国内验入库
     */
    @JsonProperty("orderType")
    private String orderType;
    /**
     * 订单状态
     * DR-草稿：卖家创建草稿单
     * OD-已下单：卖家创建订单，但尚未发货。
     * RE-已收货: Winit承运，国内验货仓已收货。
     * IC-验货完成：
     * ①标准海外仓入库和标准快递入库，国内验货仓验货完成。
     * ②自验，自验验货完成。
     * TS-运输中:
     * ①Winit承运时，国内验货仓出库完成。
     * ②卖家直发时，卖家确认发货。
     * PEWC-部分到仓 ：入库单内部分包裹在海外仓卸货。
     * EWC-已到仓 ：入库单内所有无异常(丢失或终止)的包裹在海外仓卸货。
     * SHD-已上架：入库单内所有无异常(丢失或终止)的包裹在海外仓已上架。
     * VO-作废:已下单状态下作废的订单。
     * STOP-终止:运输中状态下终止的订单。
     */
    @JsonProperty("status")
    private String status;
    /**
     * 验货仓编码
     */
    @JsonProperty("inspectionWarehouseCode")
    private String inspectionWarehouseCode;
    /**
     * 验货仓名称
     */
    @JsonProperty("inspectionWarehouseName")
    private String inspectionWarehouseName;
    /**
     * 目的仓编码
     */
    @JsonProperty("destinationWarehouseCode")
    private String destinationWarehouseCode;
    /**
     * 目的仓名称
     */
    @JsonProperty("destinationWarehouseName")
    private String destinationWarehouseName;
    /**
     * 创建时间
     */
    @JsonProperty("createdDate")
    private String createdDate;
    /**
     * 客户订单号
     */
    @JsonProperty("sellerOrderNo")
    private String sellerOrderNo;
    /**
     * WINIT产品编码
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * WINIT产品名称
     */
    @JsonProperty("winitProductName")
    private String winitProductName;
    /**
     * 目标上架时间
     * 目标上架时间=实际到仓时间+SLA（北京时间）
     * 假设实际到仓时间是2016-09-09 09:50:54，SLA是1，那么目标上架时间=2016-09-10 09:50:54
     */
    @JsonProperty("planShelfCompletedDate")
    private String planShelfCompletedDate;
    /**
     * 海外仓实际上架时间
     * 北京时间
     */
    @JsonProperty("shelveCompletedDate")
    private String shelveCompletedDate;
    /**
     * 总包裹数
     */
    @JsonProperty("totalPackageQty")
    private Integer totalPackageQty;
    /**
     * 总商品数
     */
    @JsonProperty("totalMerchandiseQty")
    private Integer totalMerchandiseQty;
    /**
     * 总单品数
     */
    @JsonProperty("totalItemQty")
    private Integer totalItemQty;
    /**
     * 物流计划编码
     */
    @JsonProperty("logisticsPlanNo")
    private String logisticsPlanNo;
    /**
     * 物流计划名称
     */
    @JsonProperty("logisticsPlanName")
    private String logisticsPlanName;
    /**
     * 出口商编码
     */
    @JsonProperty("exporterCode")
    private String exporterCode;
    /**
     * 出口商名称
     */
    @JsonProperty("exporterName")
    private String exporterName;
    /**
     * 进口商编码
     */
    @JsonProperty("importerCode")
    private String importerCode;
    /**
     * 进口商名称
     */
    @JsonProperty("importerName")
    private String importerName;
    /**
     * 验货类型
     * WI-验货仓验货
     * VI-上门验货
     */
    @JsonProperty("inspectionType")
    private String inspectionType;
    /**
     * 提货类型
     * P-Winit上门提货
     * S-自发物流
     */
    @JsonProperty("pickupType")
    private String pickupType;
    /**
     * 预计提货日期
     */
    @JsonProperty("reservePickupDate")
    private String reservePickupDate;
    /**
     * 预计提货时间
     */
    @JsonProperty("reservePickupTime")
    private String reservePickupTime;
    /**
     * 提货/验货地址编码
     */
    @JsonProperty("pickupAddressCode")
    private String pickupAddressCode;
    /**
     * 提货地址
     */
    @JsonProperty("pickupAddress")
    private String pickupAddress;
    /**
     * 快递单号
     * 提货类型为自发物流时会有快递单号
     */
    @JsonProperty("expressNo")
    private String expressNo;
    /**
     * 发货承运编码
     * 提货类型为自发物流时会有发货承运编码
     */
    @JsonProperty("expressVendorCode")
    private String expressVendorCode;
    /**
     * 发货承运人名称
     * 提货类型为自发物流时会有发货承运人名称
     */
    @JsonProperty("expressVendorName")
    private String expressVendorName;
    /**
     * 进口报关规则编码
     */
    @JsonProperty("importDeclarationRuleCode")
    private String importDeclarationRuleCode;
    /**
     * 进口报关规则编码名称
     */
    @JsonProperty("importDeclarationRuleName")
    private String importDeclarationRuleName;
    /**
     * 进口申报价值
     * IMPORTPRICE1-进口申报价值,
     * IMPORTPRICE2-采购成本,
     * CUSTOMS_IMPORTPRICE-海关建议申报价值
     */
    @JsonProperty("importDeclareValueType")
    private String importDeclareValueType;
    /**
     * 报关方式
     * 进口报关方式
     * Genenal——传统清关模式,
     * Fiscal——电商清关模式,
     * Bond——美国Bond模式
     */
    @JsonProperty("importDeclareWay")
    private String importDeclareWay;
    /**
     * 进口报关类型编码
     */
    @JsonProperty("importDeclarationType")
    private String importDeclarationType;
    /**
     * 进口报关类型名称
     */
    @JsonProperty("importDeclarationName")
    private String importDeclarationName;
    /**
     * 出口报关类型编码
     */
    @JsonProperty("customsDeclarationType")
    private String customsDeclarationType;
    /**
     * 出口报关类型名称
     */
    @JsonProperty("customsDeclarationName")
    private String customsDeclarationName;
    /**
     * 包裹列表
     */
    @JsonProperty("packageList")
    private List<PackageListVO> packageList;
    /**
     * 以订单级依sku进行汇总的数量
     */
    @JsonProperty("merchandiseList")
    private List<MerchandiseListVO> merchandiseList;
}

