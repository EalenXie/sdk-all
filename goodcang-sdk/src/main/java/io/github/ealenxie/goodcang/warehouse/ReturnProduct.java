package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 15:14
 */
@Getter
@Setter
public class ReturnProduct {
    /**
     * 数量
     */
    @JsonProperty("num")
    private Integer num;
    /**
     * 更换商品编码
     */
    @JsonProperty("return_replacement_sku")
    private String returnReplacementSku;
    /**
     * 图片信息
     */
    @JsonProperty("photo_list")
    private List<String> photoList;
    /**
     * 客户商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
}
