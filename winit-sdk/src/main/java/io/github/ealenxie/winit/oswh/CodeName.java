package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:15
 */
@Getter
@Setter
public class CodeName {
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
}
