package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 15:51
 * @version 1.0
 */
@Getter
@Setter
public class Description {
    /**
     * hint
     */
    @JsonProperty("hint")
    private String hint;
    /**
     * editable
     */
    @JsonProperty("editable")
    private Boolean editable;
    /**
     * defaultX
     */
    @JsonProperty("default")
    private String defaultX;
}
