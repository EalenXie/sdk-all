package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 10:42
 * @version 1.0
 */
@Getter
@Setter
public class SellerQueryParams {
    /**
     * seller.id
     */
    @JsonProperty("seller.id")
    private String sellerId;
}
