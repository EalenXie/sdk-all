package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 15:37
 */
@Getter
@Setter
public class ReturnProductDetail {
    /**
     * 商品编码
     */
    @JsonProperty("product_barcode")
    private String productBarcode;
    /**
     * 客户商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 良品数量
     */
    @JsonProperty("sellable_qty")
    private Integer sellableQty;
    /**
     * 不良品数量
     */
    @JsonProperty("unsellable_qty")
    private Integer unsellableQty;
    /**
     * 销毁数量
     */
    @JsonProperty("destruction_qty")
    private Integer destructionQty;
    /**
     * 良品明细
     */
    @JsonProperty("sellable_detail")
    private List<PasCodeDetail> sellableDetail;
    /**
     * 不良品明细
     */
    @JsonProperty("unsellable_detail")
    private List<PasCodeDetail> unsellableDetail;
    /**
     * 销毁明细
     */
    @JsonProperty("destruction_detail")
    private List<PasCodeDetail> destructionDetail;
    /**
     * 退件授权
     */
    @JsonProperty("return_auth")
    private Integer returnAuth;
    /**
     * 换标SKU
     */
    @JsonProperty("return_replacement_sku")
    private String returnReplacementSku;
    /**
     * 图片信息
     */
    @JsonProperty("photo_list")
    private List<String> photoList;
}
