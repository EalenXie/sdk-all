package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 16:11
 */
@Getter
@Setter
public class ProductFreezeListResponse {


    /**
     * 商品冻结数据列表
     */
    @JsonProperty("list")
    private List<ProductFreeze> list;
    /**
     * 总记录数
     */
    @JsonProperty("total")
    private Integer total;
}
