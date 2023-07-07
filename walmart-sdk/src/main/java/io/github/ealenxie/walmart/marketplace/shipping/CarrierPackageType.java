package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 11:13
 */
@Getter
@Setter
public class CarrierPackageType {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * packageTypeShortName
     */
    @JsonProperty("packageTypeShortName")
    private String packageTypeShortName;
    /**
     * packageTypeDisplayName
     */
    @JsonProperty("packageTypeDisplayName")
    private String packageTypeDisplayName;
    /**
     * length
     */
    @JsonProperty("length")
    private Integer length;
    /**
     * width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * height
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * dimensionUnit
     */
    @JsonProperty("dimensionUnit")
    private String dimensionUnit;
}
