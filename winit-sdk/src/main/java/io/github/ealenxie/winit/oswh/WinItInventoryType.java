package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 10:43
 * @version 1.0
 */
@Getter
@Setter
public class WinItInventoryType {

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
     * 业务用途类型
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
    /**
     * 库存位置
     */
    @JsonProperty("location")
    private String location;
    /**
     * 组织
     */
    @JsonProperty("organization")
    private String organization;
    /**
     * 客户代码
     */
    @JsonProperty("userCustomerCode")
    private String userCustomerCode;
    /**
     * 商品编码
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * 商品名称
     */
    @JsonProperty("merchandiseName")
    private String merchandiseName;
    /**
     * 商品条码
     */
    @JsonProperty("merchandiseSerno")
    private String merchandiseSerno;
    @JsonProperty("merchandiseEnName")
    private String merchandiseEnName;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 是否禁止出库,Y 为禁止,N为不禁止,部分：PART
     */
    @JsonProperty("isProhibitOutbound")
    private String isProhibitOutbound;
    /**
     * 可用库存数
     */
    @JsonProperty("usableQty")
    private Integer usableQty;
    /**
     * 禁止出库的可用库存数
     */
    @JsonProperty("prohibitUsableQty")
    private Integer prohibitUsableQty;
    @JsonProperty("waitingOutboundQty")
    private Integer waitingOutboundQty;
    /**
     * 冻结库存数
     */
    @JsonProperty("frozenQty")
    private Integer frozenQty;
    @JsonProperty("waitingDestructionQty")
    private String waitingDestructionQty;
    @JsonProperty("saleByProxyQty")
    private String saleByProxyQty;
    @JsonProperty("lostConfirmingQty")
    private Integer lostConfirmingQty;
    /**
     * 在库库存
     */
    @JsonProperty("inStockQty")
    private Integer inStockQty;
    /**
     * 在途待入库
     */
    @JsonProperty("onOrderQty")
    private Integer onOrderQty;
    @JsonProperty("outboundQty")
    private Integer outboundQty;
    @JsonProperty("inboundQty")
    private Integer inboundQty;
    @JsonProperty("destructionQty")
    private String destructionQty;
    @JsonProperty("lostQty")
    private String lostQty;
    @JsonProperty("swQty")
    private String swQty;
    @JsonProperty("swStoreQty")
    private String swStoreQty;
    @JsonProperty("swSupplyQty")
    private String swSupplyQty;
    @JsonProperty("swOnOrderQty")
    private String swOnOrderQty;
    @JsonProperty("waitingOutboundAllocationQty")
    private String waitingOutboundAllocationQty;
    @JsonProperty("onOrderAllocationQty")
    private String onOrderAllocationQty;
    @JsonProperty("inboundAllocationQty")
    private String inboundAllocationQty;
    @JsonProperty("outboundAllocationQty")
    private String outboundAllocationQty;
    @JsonProperty("firstShelvesDate")
    private String firstShelvesDate;
    @JsonProperty("doi")
    private String doi;
    @JsonProperty("averageStockQty")
    private String averageStockQty;
    @JsonProperty("averageSalesQty")
    private String averageSalesQty;
    @JsonProperty("countryDoi")
    private String countryDoi;
    @JsonProperty("currentStockQty")
    private String currentStockQty;
    @JsonProperty("averageStockQty7")
    private String averageStockQty7;
    @JsonProperty("averageStockQty15")
    private String averageStockQty15;
    @JsonProperty("averageSalesQty7")
    private String averageSalesQty7;
    @JsonProperty("averageSalesQty15")
    private String averageSalesQty15;
    @JsonProperty("formerMerchandiseSerno")
    private String formerMerchandiseSerno;
    @JsonProperty("formerMerchandiseCode")
    private String formerMerchandiseCode;
    @JsonProperty("isMaintainMerchandise")
    private String isMaintainMerchandise;
    @JsonProperty("qtyOrdered")
    private String qtyOrdered;
    @JsonProperty("qtyReserved")
    private String qtyReserved;
    @JsonProperty("isReturn")
    private String isReturn;
    /**
     * 是否有效
     */
    @JsonProperty("isActive")
    private String isActive;
    @JsonProperty("isReturnInventory")
    private String isReturnInventory;
    @JsonProperty("preSaleWaitOutQty")
    private Integer preSaleWaitOutQty;
    @JsonProperty("organizationName")
    private String organizationName;
    @JsonProperty("prohibitFrozenQty")
    private String prohibitFrozenQty;
    @JsonProperty("userCustomerName")
    private String userCustomerName;
    /**
     * 版本号，唯一，日期格式+唯一序列yyyyMMddHHmmssSSS + 4位数字
     */
    @JsonProperty("version")
    private String version;
}
