package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.Pagination;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/5/23 15:47
 */
@Getter
@Setter
public class ProductSkuListPayload extends Pagination {
    /**
     * 客户SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 客户SKU
     */
    @JsonProperty("product_sku_arr")
    private List<String> productSkuArr;
    /**
     * 修改开始时间
     * 格式:Y-m-d H:i:s 示例 : 2020-07-15 09:00:00
     */
    @JsonProperty("product_update_time_from")
    private String productUpdateTimeFrom;
    /**
     * 修改结束时间
     * 格式:Y-m-d H:i:s 示例 : 2020-07-15 09:00:00
     */
    @JsonProperty("product_update_time_to")
    private String productUpdateTimeTo;

}
