package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 14:28
 * @version 1.0
 */
@Getter
@Setter
public class WareHouseReceiptDetails {

    @JsonProperty("chargeNo")
    private String chargeNo;
    /**
     * 仓租时间,格式：yyyy-MM-dd
     */
    @JsonProperty("chargeDate")
    private String chargeDate;
    /**
     * 上架时间,格式：yyyy-MM-dd
     */
    @JsonProperty("shelveDate")
    private String shelveDate;
    /**
     * 海外仓编码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 海外仓名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 商品编码
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 商品中文
     */
    @JsonProperty("merchandiseName")
    private String merchandiseName;
    /**
     * 商品条码
     */
    @JsonProperty("merchandiseBarcode")
    private String merchandiseBarcode;
    /**
     * 库龄（天）
     */
    @JsonProperty("merchandiseAge")
    private Integer merchandiseAge;
    /**
     * 商品数量
     */
    @JsonProperty("totalQty")
    private Integer totalQty;
    /**
     * 总体积（CBM）
     */
    @JsonProperty("totalVolume")
    private String totalVolume;
    /**
     * 货型
     */
    @JsonProperty("cargoType")
    private String cargoType;
    /**
     * 价格表编码
     */
    @JsonProperty("priceVersion")
    private String priceVersion;
    /**
     * 价格版本
     */
    @JsonProperty("priceCode")
    private String priceCode;
    /**
     *
     */
    @JsonProperty("totalPrice")
    private String totalPrice;
    /**
     * 价格币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 计费单价
     */
    @JsonProperty("price")
    private String price;
    /**
     * 海外仓储收费单号创建时间（精确到秒）yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("created")
    private String created;
    @JsonProperty("serviceType")
    private String serviceType;
    @JsonProperty("boxSpecNo")
    private String boxSpecNo;
    @JsonProperty("merchandiseGrade")
    private String merchandiseGrade;
    @JsonProperty("isBatchManager")
    private String isBatchManager;
    @JsonProperty("isReturn")
    private String isReturn;
    @JsonProperty("isHighValue")
    private String isHighValue;
    @JsonProperty("isMinCharge")
    private String isMinCharge;
    @JsonProperty("isChartered")
    private String isChartered;
    @JsonProperty("rackCode")
    private String rackCode;
    @JsonProperty("chargeName")
    private String chargeName;
    @JsonProperty("chargeVolume")
    private String chargeVolume;
    @JsonProperty("skuType")
    private String skuType;
    @JsonProperty("electricType")
    private String electricType;
    @JsonProperty("skuThirdQty")
    private String skuThirdQty;
    @JsonProperty("chargeAmountOld")
    private String chargeAmountOld;
    @JsonProperty("chargeAmountNew")
    private String chargeAmountNew;
    @JsonProperty("sizeSource")
    private String sizeSource;
    @JsonProperty("recalcAdjType")
    private String recalcAdjType;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("docNo")
    private String docNo;
    @JsonProperty("isPallet")
    private String isPallet;
    @JsonProperty("dimension")
    private String dimension;
    @JsonProperty("palletQty")
    private String palletQty;
    @JsonProperty("packageQty")
    private String packageQty;
    @JsonProperty("isInsured")
    private String isInsured;
    @JsonProperty("chargeTypeName")
    private String chargeTypeName;
}
