package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:18
 */
@Getter
@Setter
public class DeclarationRule {
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * iorName
     */
    @JsonProperty("iorName")
    private String iorName;
    /**
     * iorCode
     */
    @JsonProperty("iorCode")
    private String iorCode;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
}
