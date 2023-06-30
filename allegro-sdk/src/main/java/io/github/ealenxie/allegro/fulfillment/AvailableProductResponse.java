package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/30 17:48
 * @version 1.0
 */
@NoArgsConstructor
@Data
@Getter
@Setter
public class AvailableProductResponse {

    /**
     * products
     */
    @JsonProperty("products")
    private List<Products> products;
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
