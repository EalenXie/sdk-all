package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 14:46
 */
@Getter
@Setter
public class AddImportCountryPayload {

    /**
     * 商品进口国清关信息
     */
    @JsonProperty("product_country")
    private List<ProductCountry> productCountry;
}
