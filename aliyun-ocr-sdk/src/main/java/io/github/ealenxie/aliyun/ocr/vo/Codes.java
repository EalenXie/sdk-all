package io.github.ealenxie.aliyun.ocr.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/4/1 15:52
 */
@Getter
@Setter
public class Codes {
    @JsonProperty("data")
    private String data;
    @JsonProperty("points")
    private List<Points> points;
    @JsonProperty("type")
    private String type;
}
