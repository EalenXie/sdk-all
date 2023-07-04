package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 14:39
 * @version 1.0
 */
@Getter
@Setter
public class MerchandiseListPayload {
    /**
     * ebay交易ID
     */
    @JsonProperty("eBayTransactionId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String eBayTransactionId;
    /**
     * ebay条目ID
     */
    @JsonProperty("eBayItemId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String eBayItemId;
    /**
     * 商品名称
     */
    @JsonProperty("merchandiseName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseName;
    /**
     * 商品编码
     */
    @JsonProperty("merchandiseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseCode;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer quantity;
    /**
     * 商品规格
     */
    @JsonProperty("specifications")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String specifications;
    /**
     * 售价
     */
    @JsonProperty("salePrice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double salePrice;
    /**
     * 销售币种
     */
    @JsonProperty("saleCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String saleCurrency;
    /**
     * 申报价格
     */
    @JsonProperty("declaredValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double declaredValue;
    /**
     * 申报币种
     */
    @JsonProperty("declaredCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String declaredCurrency;
    /**
     * 申报品名(中文)
     */
    @JsonProperty("declaredNameCn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String declaredNameCn;
    /**
     * 申报品名(英文)
     */
    @JsonProperty("declaredNameEn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String declaredNameEn;
    /**
     * 商品海关编码
     */
    @JsonProperty("declaredHscode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String declaredHscode;
}
