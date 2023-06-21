package io.github.ealenxie.winit.oswh.inventory.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author create by sch  2023/1/28 15:04
 * @version 1.0
 */
@Getter
@Setter
public class InventoryStatement {

    @JsonProperty("ctx")
    private String ctx;
    @JsonProperty("batchNo")
    private String batchNo;
    @JsonProperty("boxSpecNo")
    private String boxSpecNo;
    /**
     * 商品等级
     */
    @JsonProperty("merchandiseGrade")
    private String merchandiseGrade;
    /**
     * 库存单位
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * 库存类型
     */
    @JsonProperty("serviceType")
    private String serviceType;
    /**
     * 供应渠道
     */
    @JsonProperty("provideChannel")
    private String provideChannel;
    /**
     * 销售渠道
     */
    @JsonProperty("salesChannel")
    private String salesChannel;
    @JsonProperty("location")
    private String location;
    @JsonProperty("organization")
    private String organization;
    @JsonProperty("userCustomerCode")
    private String userCustomerCode;
    /**
     * 商品编码
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * 商品条码
     */
    @JsonProperty("merchandiseSerno")
    private String merchandiseSerno;
    /**
     * 规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 客户名称
     */
    @JsonProperty("customerName")
    private String customerName;
    /**
     * 订单类型
     */
    @JsonProperty("docType")
    private String docType;
    /**
     * 订单号
     */
    @JsonProperty("docNo")
    private String docNo;
    /**
     * 中文名称
     */
    @JsonProperty("cnName")
    private String cnName;
    /**
     * 英文名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 期初数量
     */
    @JsonProperty("startQty")
    private Integer startQty;
    /**
     * 期末数量
     */
    @JsonProperty("endQty")
    private Integer endQty;
    /**
     * 变动数量
     */
    @JsonProperty("changeQty")
    private Integer changeQty;
    /**
     * 变动日期
     */
    @JsonProperty("changeDate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date changeDate;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("batchInfoVo")
    private String batchInfoVo;
    @JsonProperty("organizationName")
    private String organizationName;
    @JsonProperty("userCustomerName")
    private String userCustomerName;
    @JsonProperty("operationType")
    private String operationType;
    @JsonProperty("operationTypeName")
    private String operationTypeName;
    @JsonProperty("attribute1")
    private String attribute1;
    @JsonProperty("modifyReasonType")
    private String modifyReasonType;
    @JsonProperty("technicalTerm")
    private String technicalTerm;
}
