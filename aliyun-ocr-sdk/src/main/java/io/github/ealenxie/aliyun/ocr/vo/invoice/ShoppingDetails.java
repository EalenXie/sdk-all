package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 12:35
 */
@Getter
@Setter
public class ShoppingDetails {

    /**
     * 商品名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 商品单价
     */
    @JsonProperty("price")
    private String price;
    /**
     * 商品数量
     */
    @JsonProperty("quantity")
    private String quantity;
}
