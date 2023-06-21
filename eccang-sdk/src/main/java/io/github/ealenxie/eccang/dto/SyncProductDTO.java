package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by EalenXie on 2022/12/12 15:24
 */
@Getter
@Setter
public class SyncProductDTO {

    @JsonProperty("actionType")
    private String actionType;
    @JsonProperty("productSku")
    private String productSku;
    @JsonProperty("productTitle")
    private String productTitle;
    @JsonProperty("productTitleEn")
    private String productTitleEn;
    @JsonProperty("pdOverseaTypeCn")
    private String pdOverseaTypeCn;
    @JsonProperty("pdOverseaTypeEn")
    private String pdOverseaTypeEn;
    @JsonProperty("productDeclaredValue")
    private String productDeclaredValue;
    @JsonProperty("pdDeclareCurrencyCode")
    private String pdDeclareCurrencyCode;
    @JsonProperty("productPurchaseValue")
    private String productPurchaseValue;
    @JsonProperty("productPurchaseValueNotTax")
    private String productPurchaseValueNotTax;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("productWeight")
    private String productWeight;
    @JsonProperty("defaultSupplierCode")
    private String defaultSupplierCode;
    @JsonProperty("productPrice")
    private String productPrice;
    @JsonProperty("referenceUnitPrice")
    private String referenceUnitPrice;
    @JsonProperty("refUrl")
    private List<String> refUrl;
    @JsonProperty("procutCategoryName1")
    private String procutCategoryName1;
    @JsonProperty("procutCategoryName2")
    private String procutCategoryName2;
    @JsonProperty("procutCategoryName3")
    private String procutCategoryName3;
    @JsonProperty("procutCategoryNameEn1")
    private String procutCategoryNameEn;
    @JsonProperty("procutCategoryNameEn2")
    private String procutCategoryNameEn2;
    @JsonProperty("procutCategoryNameEn3")
    private String procutCategoryNameEn3;
    @JsonProperty("productCategroyId1")
    private Integer productCategroyId1;
    @JsonProperty("productCategroyId2")
    private Integer productCategroyId2;
    @JsonProperty("productCategroyId3")
    private Integer productCategroyId3;
    @JsonProperty("oprationType")
    private Integer oprationType;
    @JsonProperty("productStatus")
    private Integer productStatus;
    @JsonProperty("saleStatus")
    private Integer saleStatus;
    @JsonProperty("hsCode")
    private String hsCode;
    @JsonProperty("productLength")
    private BigDecimal productLength;
    @JsonProperty("productWidth")
    private BigDecimal productWidth;
    @JsonProperty("productHeight")
    private BigDecimal productHeight;
    @JsonProperty("pdNetLength")
    private BigDecimal pdNetLength;
    @JsonProperty("pdNetWidth")
    private BigDecimal pdNetWidth;
    @JsonProperty("pdNetHeight")
    private BigDecimal pdNetHeight;
    @JsonProperty("pdNetWeight")
    private BigDecimal pdNetWeight;
    @JsonProperty("productSpecs")
    private String productSpecs;
    @JsonProperty("productPackageWeight")
    private BigDecimal productPackageWeight;
    @JsonProperty("allowFloatWeight")
    private BigDecimal allowFloatWeight;
    @JsonProperty("fboTaxRate")
    private BigDecimal fboTaxRate;
    @JsonProperty("designerStartTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date designerStartTime;
    @JsonProperty("designerEndTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date designerEndTime;
    @JsonProperty("designerId")
    private Integer designerId;
    @JsonProperty("personOpraterId")
    private Integer personOpraterId;
    @JsonProperty("personSellerId")
    private Integer personSellerId;
    @JsonProperty("personDevelopId")
    private Integer personDevelopId;
    @JsonProperty("productColorId")
    private Integer productColorId;
    @JsonProperty("productSizeId")
    private Integer productSizeId;
    @JsonProperty("upcCode")
    private String upcCode;
    @JsonProperty("productMaterial")
    private String productMaterial;
    @JsonProperty("materialEn")
    private String materialEn;
    @JsonProperty("productFbaSizeType")
    private Integer productFbaSizeType;
    @JsonProperty("spEtaTime")
    private Integer spEtaTime;
    @JsonProperty("spMinQty")
    private Integer spMinQty;
    @JsonProperty("spSupplierSku")
    private String spSupplierSku;
    @JsonProperty("spProductAddress")
    private List<String> spProductAddress;
    @JsonProperty("prlId")
    private Integer prlId;
    @JsonProperty("parentProductId")
    private Integer parentProductId;
    @JsonProperty("isEndProduct")
    private Integer isEndProduct;
    @JsonProperty("containBattery")
    private Integer containBattery;
    @JsonProperty("isImitation")
    private Integer isImitation;
    @JsonProperty("isQc")
    private Integer isQc;
    @JsonProperty("qcTemplateName")
    private String qcTemplateName;
    @JsonProperty("productIsCombination")
    private Integer productIsCombination;
    @JsonProperty("labelingType")
    private String labelingType;
    @JsonProperty("selfPropertyList")
    private List<SelfPropertyList> selfPropertyList;
    @JsonProperty("brandCode")
    private String brandCode;
    @JsonProperty("brandName")
    private String brandName;
    @JsonProperty("isExpDate")
    private Integer isExpDate;
    @JsonProperty("expDate")
    private Integer expDate;
    @JsonProperty("warehouseBarcodeList")
    private Object warehouseBarcodeList;
    @JsonProperty("productOrigin")
    private String productOrigin;
    @JsonProperty("grossProfit")
    private BigDecimal grossProfit;
    @JsonProperty("isGift")
    private Integer isGift;
    @JsonProperty("taxRate")
    private BigDecimal taxRate;
    @JsonProperty("productImgUrlList")
    private List<String> productImgUrlList;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("userOrganizationId")
    private Integer userOrganizationId;
    @JsonProperty("defaultWarehouseId")
    private Integer defaultWarehouseId;
    @JsonProperty("eanCode")
    private String eanCode;
    @JsonProperty("puc_id")
    private String pucId;
    @JsonProperty("defaultBuyWarehouseId")
    private Integer defaultBuyWarehouseId;
    @JsonProperty("logisticAttribute")
    private String logisticAttribute;
    @JsonProperty("fitting")
    private List<Fitting> fitting;
    @JsonProperty("package")
    private List<Package> packageList;
    @JsonProperty("containSpecialGoods")
    private Integer containSpecialGoods;
    @JsonProperty("containNonLiquidCosmetics")
    private Integer containNonLiquidCosmetics;
    @JsonProperty("periodic")
    private Integer periodic;
    @JsonProperty("prtId")
    private Integer prtId;
    @JsonProperty("seller")
    private List<String> seller;


}
