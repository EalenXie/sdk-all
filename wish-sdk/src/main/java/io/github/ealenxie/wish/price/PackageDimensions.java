package io.github.ealenxie.wish.price;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 9:50
 * @version 1.0
 */
@Getter
@Setter
public class PackageDimensions {
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
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * height
     */
    @JsonProperty("height")
    private Integer height;
}
