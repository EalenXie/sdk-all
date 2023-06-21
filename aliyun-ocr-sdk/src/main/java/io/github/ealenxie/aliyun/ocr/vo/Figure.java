package io.github.ealenxie.aliyun.ocr.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 16:20
 */
@Setter
@Getter
public class Figure {


    /**
     * 图案类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 人像图案左上角横坐标
     */
    @JsonProperty("x")
    private Integer x;
    /**
     * 人像图案左上角纵坐标
     */
    @JsonProperty("y")
    private Integer y;
    /**
     * 人像图案宽度
     */
    @JsonProperty("w")
    private Integer w;
    /**
     * 人像图案高度
     */
    @JsonProperty("h")
    private Integer h;
    /**
     * 人像图案坐标信息
     */
    @JsonProperty("box")
    private Box box;
}
