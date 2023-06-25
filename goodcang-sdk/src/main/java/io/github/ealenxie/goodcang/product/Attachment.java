package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 16:03
 */
@Getter
@Setter
public class Attachment {
    /**
     * 国家/地区简称
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 进口国申报单价
     */
    @JsonProperty("import_declared_value")
    private Double importDeclaredValue;
    /**
     * 材质
     */
    @JsonProperty("product_material")
    private String productMaterial;
    /**
     * 用途
     */
    @JsonProperty("product_use")
    private String productUse;
}
