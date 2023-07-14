package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/14 17:14
 */
@Getter
@Setter
public class IspOrderMerchandise {
    /**
     * itemID
     */
    @JsonProperty("itemID")
    private String itemID;
    /**
     * hsCode
     */
    @JsonProperty("hsCode")
    private String hsCode;
    /**
     * goodsLocation
     */
    @JsonProperty("goodsLocation")
    private String goodsLocation;
    /**
     * declaredNameEn
     */
    @JsonProperty("declaredNameEn")
    private String declaredNameEn;
    /**
     * declaredNameCn
     */
    @JsonProperty("declaredNameCn")
    private String declaredNameCn;
    /**
     * merchandiseCode
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * merchandiseQuantity
     */
    @JsonProperty("merchandiseQuantity")
    private Integer merchandiseQuantity;
    /**
     * transactionID
     */
    @JsonProperty("transactionID")
    private String transactionID;
    /**
     * declaredValue
     */
    @JsonProperty("declaredValue")
    private BigDecimal declaredValue;
    /**
     * ebayItemPrice
     */
    @JsonProperty("ebayItemPrice")
    private Integer ebayItemPrice;



}
