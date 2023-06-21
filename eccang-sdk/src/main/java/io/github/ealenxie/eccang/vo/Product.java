package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.eccang.dto.SelfPropertyList;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by EalenXie on 2022/12/12 16:36
 */
@Getter
@Setter
public class Product {

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
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("purcurrencycode")
    private String purcurrencycode;
    @JsonProperty("productWeight")
    private String productWeight;
    @JsonProperty("defaultSupplierCode")
    private String defaultSupplierCode;
    @JsonProperty("supplierSku")
    private String supplierSku;
    @JsonProperty("productPrice")
    private String productPrice;
    @JsonProperty("procutCategoryCode1")
    private String procutCategoryCode1;
    @JsonProperty("procutCategoryCode2")
    private String procutCategoryCode2;
    @JsonProperty("procutCategoryCode3")
    private String procutCategoryCode3;
    @JsonProperty("procutCategoryName1")
    private String procutCategoryName1;
    @JsonProperty("procutCategoryName2")
    private String procutCategoryName2;
    @JsonProperty("procutCategoryName3")
    private String procutCategoryName3;
    @JsonProperty("oprationType")
    private Integer oprationType;
    @JsonProperty("saleStatus")
    private Integer saleStatus;
    @JsonProperty("hsCode")
    private String hsCode;
    @JsonProperty("productLength")
    private Double productLength;
    @JsonProperty("productWidth")
    private Double productWidth;
    @JsonProperty("productHeight")
    private Double productHeight;
    @JsonProperty("pdNetLength")
    private Double pdNetLength;
    @JsonProperty("pdNetWidth")
    private Double pdNetWidth;
    @JsonProperty("pdNetHeight")
    private Double pdNetHeight;
    @JsonProperty("pdNetWeight")
    private Double pdNetWeight;
    @JsonProperty("allowFloatWeight")
    private Double allowFloatWeight;
    @JsonProperty("fboTaxRate")
    private Double fboTaxRate;
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
    @JsonProperty("productColorName")
    private String productColorName;
    @JsonProperty("productColorNameEn")
    private String productColorNameEn;
    @JsonProperty("productSizeId")
    private Integer productSizeId;
    @JsonProperty("productSizeName")
    private String productSizeName;
    @JsonProperty("productSizeNameEn")
    private String productSizeNameEn;
    @JsonProperty("upcCode")
    private String upcCode;
    @JsonProperty("productMaterial")
    private String productMaterial;
    @JsonProperty("productMaterialEn")
    private String productMaterialEn;
    @JsonProperty("use")
    private String use;
    @JsonProperty("useEn")
    private String useEn;
    @JsonProperty("pdDeclarationStatement")
    private String pdDeclarationStatement;
    @JsonProperty("productFbaSizeType")
    private Integer productFbaSizeType;
    @JsonProperty("spEtaTime")
    private Integer spEtaTime;
    @JsonProperty("spMinQty")
    private Integer spMinQty;
    @JsonProperty("spProductAddress")
    private List<String> spProductAddress;
    @JsonProperty("spReferenceUnitPrice")
    private BigDecimal spReferenceUnitPrice;
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
    @JsonProperty("warehouseBarcode")
    private String warehouseBarcode;
    @JsonProperty("productOrigin")
    private String productOrigin;
    @JsonProperty("grossProfit")
    private Double grossProfit;
    @JsonProperty("isGift")
    private Integer isGift;
    @JsonProperty("taxRate")
    private Double taxRate;
    @JsonProperty("userOrganizationId")
    private Integer userOrganizationId;
    @JsonProperty("defaultWarehouseId")
    private Integer defaultWarehouseId;
    @JsonProperty("eanCode")
    private String eanCode;
    @JsonProperty("productAddTime")
    private String productAddTime;
    @JsonProperty("productUpdateTime")
    private String productUpdateTime;
    @JsonProperty("productCombination")
    private ProductCombination productCombination;
    @JsonProperty("productCustomCategory")
    private ProductCustomCategory productCustomCategory;
    @JsonProperty("mainImg")
    private String mainImg;
    @JsonProperty("productDescriptions")
    private List<ProductDescription> productDescriptions;
    @JsonProperty("defaultBuyerName")
    private String defaultBuyerName;
    @JsonProperty("productPackage")
    private List<ProductPackage> productPackage;
    @JsonProperty("productCost")
    private List<ProductCost> productCost;


}
