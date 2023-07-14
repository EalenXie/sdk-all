package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 18:19
 */
@Getter
@Setter
public class ProductResponse {
    /**
     * productCode
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * isSelfInspection
     */
    @JsonProperty("isSelfInspection")
    private String isSelfInspection;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * productCatalogLv2
     */
    @JsonProperty("productCatalogLv2")
    private String productCatalogLv2;
    /**
     * isDomesticSplit
     */
    @JsonProperty("isDomesticSplit")
    private String isDomesticSplit;
    /**
     * isClaim
     */
    @JsonProperty("isClaim")
    private String isClaim;
    /**
     * isIntelligentDivision
     */
    @JsonProperty("isIntelligentDivision")
    private String isIntelligentDivision;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
}
