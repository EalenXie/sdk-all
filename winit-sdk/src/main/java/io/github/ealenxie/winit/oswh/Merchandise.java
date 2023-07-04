package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/20 16:02
 * @version 1.0
 */
@Getter
@Setter
public class Merchandise {
    /**
     * 商品编码sku
     */
    @JsonProperty("merchandiseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseCode;
    /**
     * 规格
     */
    @JsonProperty("specification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String specification;
    /**
     * 要发货的某个商品的单品数量,数量必须>0。
     */
    @JsonProperty("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer quantity;
    /**
     * 若电商平台类型选择为eBay，请填写订单在平台的transation ID；
     * 若电商平台类型选择为TikTok，请填写订单在平台的Package ID。
     */
    @JsonProperty("platformTransactionId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platformTransactionId;
    /**
     * 若电商平台类型选择为eBay，请填写商品在平台的Item ID；
     * 若电商平台类型选择为TikTok，请填写商品在平台的Product ID。
     */
    @JsonProperty("platformItemId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platformItemId;
    /**
     * ebay的sellerID
     */
    @JsonProperty("platformSellerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platformSellerId;
    /**
     * 商品等级
     * GOOD:良品（必须大写）
     * DEFECTIVE:不良品（必须大写）
     */
    @JsonProperty("merchandiseGrade")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseGrade;
    /**
     * Ebay的buyerID
     */
    @JsonProperty("platformBuyerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platformBuyerId;
    /**
     * 货主编码
     */
    @JsonProperty("ownerCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ownerCode;
}
