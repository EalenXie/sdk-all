package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 37
 */
@Getter
@Setter
public class PriceRange {
    /**
     * 起批量
     */
    @JsonProperty("startQuantity")
    private Integer startQuantity;
    /**
     * 商品价格
     */
    @JsonProperty("price")
    private Double price;
}
