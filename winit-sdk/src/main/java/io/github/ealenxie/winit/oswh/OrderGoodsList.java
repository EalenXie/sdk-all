package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 10:39
 */
@NoArgsConstructor
@Data
public class OrderGoodsList {
    /**
     * originalMerchandiseSerno
     */
    @JsonProperty("originalMerchandiseSerno")
    private Object originalMerchandiseSerno;
    /**
     * merchandiseGrade
     */
    @JsonProperty("merchandiseGrade")
    private Object merchandiseGrade;
    /**
     * confirmQty
     */
    @JsonProperty("confirmQty")
    private Integer confirmQty;
    /**
     * skuCodeThird
     */
    @JsonProperty("skuCodeThird")
    private Object skuCodeThird;
    /**
     * merchandiseSerno
     */
    @JsonProperty("merchandiseSerno")
    private String merchandiseSerno;
    /**
     * ownerCode
     */
    @JsonProperty("ownerCode")
    private Object ownerCode;
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
    private Integer confirmWidth;
    /**
     * nameEn
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * confirmLength
     */
    @JsonProperty("confirmLength")
    private Integer confirmLength;
    /**
     * managementType
     */
    @JsonProperty("managementType")
    private String managementType;
    /**
     * confirmHeight
     */
    @JsonProperty("confirmHeight")
    private Integer confirmHeight;
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
    private Object originalMerchandiseCode;
}
