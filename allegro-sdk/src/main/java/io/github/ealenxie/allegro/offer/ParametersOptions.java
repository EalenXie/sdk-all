package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 14:25
 */
@Getter
@Setter
public class ParametersOptions {
    /**
     * variantsAllowed
     */
    @JsonProperty("variantsAllowed")
    private Boolean variantsAllowed;
    /**
     * variantsEqual
     */
    @JsonProperty("variantsEqual")
    private Boolean variantsEqual;
    /**
     * ambiguousValueId
     */
    @JsonProperty("ambiguousValueId")
    private String ambiguousValueId;
    /**
     * dependsOnParameterId
     */
    @JsonProperty("dependsOnParameterId")
    private String dependsOnParameterId;
    /**
     * requiredDependsOnValueIds
     */
    @JsonProperty("requiredDependsOnValueIds")
    private List<String> requiredDependsOnValueIds;
    /**
     * displayDependsOnValueIds
     */
    @JsonProperty("displayDependsOnValueIds")
    private List<String> displayDependsOnValueIds;
    /**
     * describesProduct
     */
    @JsonProperty("describesProduct")
    private Boolean describesProduct;
    /**
     * customValuesEnabled
     */
    @JsonProperty("customValuesEnabled")
    private Boolean customValuesEnabled;
}
