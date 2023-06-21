package io.github.ealenxie.aliyun.ocr.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/1 15:52
 */
@Getter
@Setter
public class Points {
    @JsonProperty("x")
    private Integer x;
    @JsonProperty("y")
    private Integer y;
}
