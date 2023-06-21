package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/12 15:25
 */
@Getter
@Setter
public class SelfPropertyList {
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
}
