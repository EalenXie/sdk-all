package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:13
 */
@NoArgsConstructor
@Data
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
