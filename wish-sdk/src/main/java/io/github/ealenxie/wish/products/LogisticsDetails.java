package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@NoArgsConstructor
@Data
public class LogisticsDetails {
    /**
     * originCountry
     */
    @JsonProperty("origin_country")
    private String originCountry;
    /**
     * weight
     */
    @JsonProperty("weight")
    private Integer weight;
    /**
     * customsHsCode
     */
    @JsonProperty("customs_hs_code")
    private String customsHsCode;
    /**
     * height
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * length
     */
    @JsonProperty("length")
    private Integer length;
    /**
     * pieces
     */
    @JsonProperty("pieces")
    private Integer pieces;
    /**
     * declaredName
     */
    @JsonProperty("declared_name")
    private String declaredName;
    /**
     * customsDeclaredValue
     */
    @JsonProperty("customs_declared_value")
    private Money customsDeclaredValue;
    /**
     * restrictedFlags
     */
    @JsonProperty("restricted_flags")
    private List<String> restrictedFlags;
    /**
     * declaredLocalName
     */
    @JsonProperty("declared_local_name")
    private String declaredLocalName;
}
