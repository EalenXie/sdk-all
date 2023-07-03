package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class SellingMode {
    /**
     * format
     */
    @JsonProperty("format")
    private String format;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * fixedPrice
     */
    @JsonProperty("fixedPrice")
    private Money fixedPrice;
    /**
     * popularity
     */
    @JsonProperty("popularity")
    private Integer popularity;
    /**
     * popularityRange
     */
    @JsonProperty("popularityRange")
    private String popularityRange;
    /**
     * bidCount
     */
    @JsonProperty("bidCount")
    private Integer bidCount;
}
