package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/12 17:26
 */
@Getter
@Setter
public class GetProductListDTO {
    @JsonProperty("productSku")
    private String productSku;
    @JsonProperty("productSkuLike")
    private String productSkuLike;
    @JsonProperty("productSpu")
    private String productSpu;
    @JsonProperty("productTitle")
    private String productTitle;
    @JsonProperty("productTitleLike")
    private String productTitleLike;
    @JsonProperty("warehouseBarcode")
    private String warehouseBarcode;
    @JsonProperty("warehouseBarcodeLike")
    private String warehouseBarcodeLike;
    @JsonProperty("productStatus")
    private Integer productStatus;
    @JsonProperty("saleStatus")
    private Integer saleStatus;
    @JsonProperty("defaultSupplierCode")
    private String defaultSupplierCode;
    @JsonProperty("isQc")
    private Integer isQc;
    @JsonProperty("isExpDate")
    private Integer isExpDate;
    @JsonProperty("isGift")
    private Integer isGift;
    @JsonProperty("personOpraterId")
    private Integer personOpraterId;
    @JsonProperty("prl_id")
    private Integer prlId;
    @JsonProperty("productAddTimeFrom")
    private String productAddTimeFrom;
    @JsonProperty("productAddTimeTo")
    private String productAddTimeTo;
    @JsonProperty("productUpdateTimeFrom")
    private String productUpdateTimeFrom;
    @JsonProperty("productUpdateTimeTo")
    private String productUpdateTimeTo;
    @JsonProperty("productReleaseTimeFrom")
    private String productReleaseTimeFrom;
    @JsonProperty("productReleaseTimeTo")
    private String productReleaseTimeTo;
    @JsonProperty("isCombination")
    private Integer isCombination;
    @JsonProperty("getProductCombination")
    private Integer getProductCombination;
    @JsonProperty("getProductBox")
    private Integer getProductBox;
    @JsonProperty("getProperty")
    private Integer getProperty;
    @JsonProperty("getProductCustomCategory")
    private Integer getProductCustomCategory;
    @JsonProperty("defaulBuyWarehouseId")
    private Integer defaulBuyWarehouseId;
    @JsonProperty("logisticAttribute")
    private String logisticAttribute;
    @JsonProperty("defaultCostUpdateFrom")
    private String defaultCostUpdateFrom;
    @JsonProperty("defaultCostUpdateTo")
    private String defaultCostUpdateTo;
    @JsonProperty("page")
    private String page;
    @JsonProperty("pageSize")
    private String pageSize;


}
