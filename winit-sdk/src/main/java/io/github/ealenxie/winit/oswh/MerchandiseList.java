package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 11:03
 * @version 1.0
 */
@Getter
@Setter
public class MerchandiseList {
    /**
     * 商品编码
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * ebay买家id
     */
    @JsonProperty("ebayBuyerID")
    private String ebayBuyerID;
    @JsonProperty("ebayItemID")
    private String ebayItemID;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 单品条码列表
     */
    @JsonProperty("itemList")
    private List<ItemList> itemList;
    /**
     * 包裹内商品数量
     */
    @JsonProperty("productNum")
    private Integer productNum;
    @JsonProperty("ebaySellerID")
    private String ebaySellerID;
    /**
     * ebau交易ID
     */
    @JsonProperty("ebayTransactionID")
    private String ebayTransactionID;
}
