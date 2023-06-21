package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    /**
     * 产品sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 订单参考号(建议使用平台单号)
     */
    @JsonProperty("transaction_id")
    private String transactionId;
    /**
     * 订单商品编码
     */
    @JsonProperty("item_id")
    private String itemId;
    /**
     * FBA商品编码
     */
    @JsonProperty("fba_product_code")
    private String fbaProductCode;
    /**
     * 合规负责人编码
     */
    @JsonProperty("euro_terms_code")
    private String euroTermsCode;
    /**
     * 换标数量
     * 换标数量
     * FBA订单适用
     */
    @JsonProperty("label_replacement_qty")
    private Integer labelReplacementQty;


    /**
     * 申报价值（价值币种同仓库币种）
     */
    @JsonProperty("product_declared_value")
    private String productDeclaredValue;
    /**
     * 海关编码
     */
    @JsonProperty("hs_code")
    private String hsCode;


}