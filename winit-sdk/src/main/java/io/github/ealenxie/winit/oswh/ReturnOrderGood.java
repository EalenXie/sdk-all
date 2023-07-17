package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 10:39
 */
@Getter
@Setter
public class ReturnOrderGood {
    /**
     * originalMerchandiseSerno
     */
    @JsonProperty("originalMerchandiseSerno")
    private String originalMerchandiseSerno;
    /**
     * merchandiseGrade
     */
    @JsonProperty("merchandiseGrade")
    private String merchandiseGrade;
    /**
     * confirmQty
     */
    @JsonProperty("confirmQty")
    private Double confirmQty;
    /**
     * skuCodeThird
     */
    @JsonProperty("skuCodeThird")
    private String skuCodeThird;
    /**
     * merchandiseSerno
     */
    @JsonProperty("merchandiseSerno")
    private String merchandiseSerno;
    /**
     * ownerCode
     */
    @JsonProperty("ownerCode")
    private String ownerCode;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * nameCn
     */
    @JsonProperty("nameCn")
    private String nameCn;
    /**
     * confirmWidth
     */
    @JsonProperty("confirmWidth")
    private Double confirmWidth;
    /**
     * nameEn
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * confirmLength
     */
    @JsonProperty("confirmLength")
    private Double confirmLength;
    /**
     * managementType
     */
    @JsonProperty("managementType")
    private String managementType;
    /**
     * confirmHeight
     */
    @JsonProperty("confirmHeight")
    private Double confirmHeight;
    /**
     * confirmVolume
     */
    @JsonProperty("confirmVolume")
    private Double confirmVolume;
    /**
     * handleMethod
     */
    @JsonProperty("handleMethod")
    private String handleMethod;
    /**
     * confirmWeight
     */
    @JsonProperty("confirmWeight")
    private Double confirmWeight;
    /**
     * inventoryAttribute
     */
    @JsonProperty("inventoryAttribute")
    private List<?> inventoryAttribute;
    /**
     * merchandiseCode
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * itemSerno
     */
    @JsonProperty("itemSerno")
    private String itemSerno;
    /**
     * originalMerchandiseCode
     */
    @JsonProperty("originalMerchandiseCode")
    private String originalMerchandiseCode;
}
