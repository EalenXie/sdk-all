package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:52
 * @version 1.0
 */
@Getter
@Setter
public class MerchandiseSizeList {
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * merchandiseCode
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * height
     */
    @JsonProperty("height")
    private String height;
    /**
     * length
     */
    @JsonProperty("length")
    private String length;
    /**
     * weight
     */
    @JsonProperty("weight")
    private String weight;
    /**
     * width
     */
    @JsonProperty("width")
    private String width;
}
