package io.github.ealenxie.aliyun.ocr.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 16:21
 */
@Setter
@Getter
public class Box {
    /**
     * x
     */
    @JsonProperty("x")
    private Integer x;
    /**
     * y
     */
    @JsonProperty("y")
    private Integer y;
    /**
     * w
     */
    @JsonProperty("w")
    private Integer w;
    /**
     * h
     */
    @JsonProperty("h")
    private Integer h;
    /**
     * angle
     */
    @JsonProperty("angle")
    private Integer angle;
}
