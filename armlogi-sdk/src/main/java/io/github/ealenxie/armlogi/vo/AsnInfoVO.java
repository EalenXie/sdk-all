package io.github.ealenxie.armlogi.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/3/31 10:43
 * @version 1.0
 */
@Getter
@Setter
public class AsnInfoVO {

    /**
     * 实际到达日期,本地时间
     */
    @JsonProperty("arrivalLocalDate")
    private String arrivalLocalDate;
    /**
     * 实际到达日期,系统时间
     */
    @JsonProperty("arrivalSysDate")
    private String arrivalSysDate;
    /**
     * 箱数
     */
    @JsonProperty("boxNum")
    private Integer boxNum;
    /**
     * 完成方式[0:标准 1:强制]
     */
    @JsonProperty("completeType")
    private Integer completeType;
    /**
     * 货柜类型[0:20GP 1:40GP 2:40HQ 3:45GP 4:45HQ]
     */
    @JsonProperty("containerType")
    private Integer containerType;
    /**
     * 创建时间
     */
    @JsonProperty("createDate")
    private String createDate;
    /**
     * 创建来源 1WMS 2OMS 3PDA 4API
     */
    @JsonProperty("createSource")
    private Integer createSource;
    /**
     * 客户说明
     */
    @JsonProperty("custRemark")
    private String custRemark;
    /**
     * 客户代码
     */
    @JsonProperty("customerCode")
    private String customerCode;
    /**
     * 明细
     */
    @JsonProperty("detailList")
    private List<DetailVO> detailList;
    /**
     * 交货方式[0:自送 1:揽收(需提供地址)]
     */
    @JsonProperty("incomeType")
    private Integer incomeType;
    /**
     * 修改时间
     */
    @JsonProperty("modifyDate")
    private String modifyDate;
    /**
     * 通知还柜日期,本地时间
     */
    @JsonProperty("notificationReturnDate")
    private String notificationReturnDate;
    /**
     * 是否先入库再建单
     */
    @JsonProperty("optBack")
    private Boolean optBack;
    /**
     * 托数量
     */
    @JsonProperty("palletNum")
    private Integer palletNum;
    /**
     * 提货Email
     */
    @JsonProperty("pickEmail")
    private String pickEmail;
    /**
     * 计划到达日期,本地时间
     */
    @JsonProperty("planArrivalDate")
    private String planArrivalDate;
    /**
     * 上架完成,本地时间
     */
    @JsonProperty("putShelfLocalDate")
    private String putShelfLocalDate;
    /**
     * 上架完成,系统时间
     */
    @JsonProperty("putShelfSysDate")
    private String putShelfSysDate;
    /**
     * 上架状态[0:未上架 1:上架中 2:已上架]
     */
    @JsonProperty("putStatus")
    private Integer putStatus;
    /**
     * 上架方式[0:SKU上架 1:按箱上架 2:托盘上架]
     */
    @JsonProperty("putawayType")
    private Integer putAwayType;
    /**
     * 收货备注
     */
    @JsonProperty("recRemark")
    private String recRemark;
    /**
     * 收货总数量
     */
    @JsonProperty("recTotalNum")
    private Integer recTotalNum;
    /**
     * 入库类型[0:标准入库 1:FBA入库 3:FBA整箱备货]
     */
    @JsonProperty("recType")
    private Integer recType;
    /**
     * 卸货完成,本地时间
     */
    @JsonProperty("receiptLocalDate")
    private String receiptLocalDate;
    /**
     * 卸货完成,系统时间
     */
    @JsonProperty("receiptSysDate")
    private String receiptSysDate;
    /**
     * 入库单号
     */
    @JsonProperty("receivingCode")
    private String receivingCode;
    /**
     * 收货异常[0:无异常 1:收货异常]
     */
    @JsonProperty("receivingException")
    private Boolean receivingException;
    /**
     * 入库单状态[0:草稿,1:已审核 2:在途 3:收货中 4:收货完成 :5上架完成 6:作废 7:预约失败]
     */
    @JsonProperty("receivingStatus")
    private Integer receivingStatus;
    /**
     * 参考编号
     */
    @JsonProperty("referenceNo")
    private String referenceNo;
    /**
     * 预约时间,本地时间
     */
    @JsonProperty("reserveLocalDate")
    private String reserveLocalDate;
    /**
     * 预约状态[0:未预约 1:已预约 2:预约成功 3:预约失败 4:已到仓 5:取消预约]
     */
    @JsonProperty("reserveStatus")
    private Integer reserveStatus;
    /**
     * 预约时间,系统时间
     */
    @JsonProperty("reserveSysDate")
    private String reserveSysDate;
    /**
     * 销售组
     */
    @JsonProperty("saleGroup")
    private String saleGroup;
    /**
     * 运输类型[0:整柜 1:托盘 2:散货]
     */
    @JsonProperty("shipType")
    private Integer shipType;
    /**
     * SKU种数
     */
    @JsonProperty("skuNum")
    private Integer skuNum;
    /**
     * 库存类型[0:标准 1:暂存]
     */
    @JsonProperty("stockType")
    private Integer stockType;
    /**
     * 时间状态[1预约 2到仓 3卸货 4上架]
     */
    @JsonProperty("timeStatus")
    private Integer timeStatus;
    /**
     * 总数量
     */
    @JsonProperty("totalNum")
    private Integer totalNum;
    /**
     * 跟踪号/柜号
     */
    @JsonProperty("trackingNumber")
    private String trackingNumber;
    /**
     * 卸货状态[FALSE:未完成 TRUE:已完成]
     */
    @JsonProperty("unloadStatus")
    private Boolean unloadStatus;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
}
