package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 16:54
 */
@Getter
@Setter
public class IspOrderMerchandiseData {
    /**
     * merchandiseCode
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * declaredNameCn
     */
    @JsonProperty("declaredNameCn")
    private String declaredNameCn;
    /**
     * declaredNameEn
     */
    @JsonProperty("declaredNameEn")
    private String declaredNameEn;
    /**
     * declaredValue
     */
    @JsonProperty("declaredValue")
    private String declaredValue;
    /**
     * hsCode
     */
    @JsonProperty("hsCode")
    private String hsCode;
    /**
     * itemID
     */
    @JsonProperty("itemID")
    private String itemID;
    /**
     * transactionID
     */
    @JsonProperty("transactionID")
    private String transactionID;
    /**
     * merchandiseQuantity
     */
    @JsonProperty("merchandiseQuantity")
    private String merchandiseQuantity;
    /**
     * goodsLocation
     */
    @JsonProperty("goodsLocation")
    private String goodsLocation;


}
