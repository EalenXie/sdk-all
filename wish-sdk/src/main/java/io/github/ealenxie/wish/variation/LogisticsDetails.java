package io.github.ealenxie.wish.variation;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 13:42
 * @version 1.0
 */
@Getter
@Setter
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
