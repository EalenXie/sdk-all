package io.github.ealenxie.walmart.marketplace.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author create by sch  2023/7/10 14:16
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PromoQueryParams {
    /**
     * promo
     */
    @JsonProperty("promo")
    private Boolean promo;
}
