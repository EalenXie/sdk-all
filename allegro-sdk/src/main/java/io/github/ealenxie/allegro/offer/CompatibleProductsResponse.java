package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 13:18
 */
@NoArgsConstructor
@Data
public class CompatibleProductsResponse {


    /**
     * compatibleProducts
     */
    @JsonProperty("compatibleProducts")
    private List<CompatibleProduct> compatibleProducts;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
