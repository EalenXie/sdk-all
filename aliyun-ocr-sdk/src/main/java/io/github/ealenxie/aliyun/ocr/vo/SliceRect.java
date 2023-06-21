package io.github.ealenxie.aliyun.ocr.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/1 15:52
 */
@Getter
@Setter
public class SliceRect {
    @JsonProperty("x0")
    private Integer x0;
    @JsonProperty("y0")
    private Integer y0;
    @JsonProperty("x1")
    private Integer x1;
    @JsonProperty("y1")
    private Integer y1;
    @JsonProperty("x2")
    private Integer x2;
    @JsonProperty("y2")
    private Integer y2;
    @JsonProperty("x3")
    private Integer x3;
    @JsonProperty("y3")
    private Integer y3;
}
