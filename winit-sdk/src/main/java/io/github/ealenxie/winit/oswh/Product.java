package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/1/28 16:07
 * @version 1.0
 */
@Getter
@Setter
public class Product {

    /**
     * 商品规格，使用需联系客服开启权限
     */
    @JsonProperty("specification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String specification;
    /**
     * 商品入库时的包装。
     * LOGISTICS：物流包装
     * SALES：销售包装
     * NUDE_CARGO：裸货
     * 不填写默认“LOGISTICS”
     */
    @JsonProperty("packaging")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String packaging;
    /**
     * 商品出库包装方式（单一订单）
     * COURIER_SATCHEL：快递袋
     * PADDED_ENVELOPE：气泡袋
     * CARTON_BOX：纸箱
     * NO：不加包装
     * 不填写默认“为空”
     */
    @JsonProperty("packagingMethod")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String packagingMethod;
    /**
     * 出库包装类别
     * 不加包装： NO
     * WINIT标准包装：PACKAGING_WINIT
     * 客制物流包装：CUSTOM_LOGISTICS
     * 客制销售包装：CUSTOM_SALE
     */
    @JsonProperty("outPackagingType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String outPackagingType;
    /**
     * 商品管理方式
     * Y：单品化管理
     * N：商品化管理
     */
    @JsonProperty("isSiManager")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isSiManager;
    /**
     * 是否有电池，Y|N
     */
    @JsonProperty("battery")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String battery;
    /**
     * battery字段为Y时必填
     * 电池种类
     * 1 :锂离子电池
     * 2 :锂金属电池
     * 3 :非锂电池
     */
    @JsonProperty("batteryTypeId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer batteryTypeId;
    /**
     * battery字段为Y时必填
     * 电池包装
     * 4 :纯电
     * 5 :内置
     * 6 :外置
     */
    @JsonProperty("batteryPackId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer batteryPackId;
    /**
     * battery字段为Y时必填
     * 电池功率
     */
    @JsonProperty("batteryPower")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer batteryPower;
    /**
     * 商品编码
     */
    @JsonProperty("productCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productCode;
    /**
     * 中文名称
     */
    @JsonProperty("chineseName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String chineseName;
    /**
     * 英文名称
     */
    @JsonProperty("englishName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String englishName;
    @JsonProperty("categoryOne")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String categoryOne;
    @JsonProperty("categoryTwo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String categoryTwo;
    @JsonProperty("categoryThree")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String categoryThree;
    /**
     * 注册重量(克/g)
     */
    @JsonProperty("registeredWeight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String registeredWeight;
    /**
     * 重量体积是否固定，请传固定值Y
     */
    @JsonProperty("fixedVolumeWeight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fixedVolumeWeight;
    /**
     * 注册商品长度(cm)
     */
    @JsonProperty("registeredLength")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String registeredLength;
    /**
     * 注册商品宽度(cm)
     */
    @JsonProperty("registeredWidth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String registeredWidth;
    /**
     * 注册商品高度(cm)
     */
    @JsonProperty("registeredHeight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String registeredHeight;
    /**
     * 是否有品牌，Y|N
     */
    @JsonProperty("branded")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String branded;
    /**
     * 品牌名称,当branded为Y时必填
     */
    @JsonProperty("brandedName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String brandedName;
    /**
     * 型号,当brandedname为Y时为必填
     */
    @JsonProperty("model")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String model;
    /**
     * 商品链接
     */
    @JsonProperty("displayPageUrl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String displayPageUrl;
    /**
     * 备注
     */
    @JsonProperty("remark")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String remark;
    /**
     * 指定包材SKU
     */
    @JsonProperty("outPackagingSku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String outPackagingSku;
    /**
     * 商品出库包装方式（复合订单）
     * 塑料袋:COURIER_SATCHEL,
     * 气泡袋:PADDED_ENVELOPE,
     * 纸箱:CARTON_BOX,
     * 不加包装:NO
     * 不填写默认“为空”
     */
    @JsonProperty("packagingMethodMulti")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String packagingMethodMulti;
    /**
     * 复合订单出库包装类别
     * 不加包装： NO
     * WINIT标准包装：PACKAGING_WINIT
     * 客制物流包装：CUSTOM_LOGISTICS
     * 客制销售包装：CUSTOM_SALE
     */
    @JsonProperty("outPackagingTypeMulti")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String outPackagingTypeMulti;
    /**
     * 复合订单出库指定包材sku
     */
    @JsonProperty("outPackagingSkuMulti")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String outPackagingSkuMulti;
    /**
     * 是否批次管理，Y/N,使用需开启权限
     */
    @JsonProperty("isBatchManager")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isBatchManager;
    /**
     * 批次属性类型
     */
    @JsonProperty("batchAttributeType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String batchAttributeType;
    /**
     * 是否包材, Y/N ,空默认N,使用需开启权限
     */
    @JsonProperty("isPackingMaterial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isPackingMaterial;
    /**
     * 商品形状 枚举值 STRIP:规则长条形、SQUARE:规则方形、ROUND:规则圆形、IRREGULAR:不规则形状
     */
    @JsonProperty("itemShape")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String itemShape;
    /**
     * 商品包装材质(入库时）枚举值 CARTON:通用纸箱、COURIER:快递袋、BUBBLE:气泡袋、WOVEN:编织袋、METAL:金属容器、CORTICAL:皮质、FOAM:泡沫箱、ELSE:其他
     */
    @JsonProperty("itemPackagingMaterial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String itemPackagingMaterial;
    /**
     * 出口国家
     */
    @JsonProperty("exportCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String exportCountry;
    /**
     * 进口国家
     */
    @JsonProperty("inporCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String inporCountry;
    /**
     * 进口申报价（USD）
     */
    @JsonProperty("inportDeclaredvalue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String inportDeclaredvalue;
    /**
     * 出口申报价（USD）
     */
    @JsonProperty("exportDeclaredvalue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String exportDeclaredvalue;
    /**
     * 进口国出口申报价（USD）
     */
    @JsonProperty("exportValueForImport")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal exportValueForImport;
    @JsonProperty("stockOutRate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String stockOutRate;
    @JsonProperty("leadTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String leadTime;
    @JsonProperty("replenishmentLeadTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String replenishmentLeadTime;
    /**
     * 携带标签
     */
    @JsonProperty("carryLabelVos")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<CarryLabel> carryLabelVos;
    /**
     * 第三方商品编码信息数据列表
     */
    @JsonProperty("itemThirdVos")
    private List<ItemThirdPayload> itemThirdDTOS;
}
