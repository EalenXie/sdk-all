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
     * 商品sku
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * 申报品名(中文)
     */
    @JsonProperty("declaredNameCn")
    private String declaredNameCn;
    /**
     * 申报品名(英文)
     */
    @JsonProperty("declaredNameEn")
    private String declaredNameEn;
    /**
     * 申报品名(英文)
     */
    @JsonProperty("declaredValue")
    private String declaredValue;
    /**
     * 海关申报编码
     */
    @JsonProperty("hsCode")
    private String hsCode;
    /**
     * ebayItemID
     */
    @JsonProperty("itemID")
    private String itemID;
    /**
     * ebay交易ID
     */
    @JsonProperty("transactionID")
    private String transactionID;
    /**
     * 商品数量
     */
    @JsonProperty("merchandiseQuantity")
    private String merchandiseQuantity;
    /**
     * 库位
     */
    @JsonProperty("goodsLocation")
    private String goodsLocation;


}
