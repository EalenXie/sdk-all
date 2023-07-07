package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:38
 * @version 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductIdTypeQueryParams {
    /**
     * productIdType
     */
    @JsonProperty("productIdType")
    private String productIdType;
}
