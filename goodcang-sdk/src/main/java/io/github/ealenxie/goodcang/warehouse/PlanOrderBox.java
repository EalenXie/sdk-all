package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 17:22
 */
@NoArgsConstructor
@Data
public class PlanOrderBox {
    /**
     * 箱号
     */
    @JsonProperty("box_no")
    private String boxNo;
    /**
     * 箱唛号
     */
    @JsonProperty("box_mark")
    private String boxMark;
    /**
     * 商品数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 商品种类
     */
    @JsonProperty("type_quantity")
    private Integer typeQuantity;
    /**
     * 商品信息
     */
    @JsonProperty("product_list")
    private List<PoProduct> productList;
}
