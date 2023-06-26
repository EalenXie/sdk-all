package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:37
 */
@Getter
@Setter
public class PasCodeDetail {
    /**
     * 售后码
     */
    @JsonProperty("pas_code")
    private String pasCode;
    /**
     * 换标sku
     */
    @JsonProperty("new_product_sku")
    private String newProductSku;
    /**
     * 退件问题
     */
    @JsonProperty("asro_problem_content")
    private String asroProblemContent;
}
