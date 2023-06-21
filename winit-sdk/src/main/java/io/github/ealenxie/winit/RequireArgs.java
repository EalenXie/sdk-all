package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by EalenXie on 2023/1/20 11:07
 */
@Getter
@Setter
public class RequireArgs extends WinitConfig {

    /**
     * 方法名/接口英文名
     */
    @JsonProperty("action")
    private String action;

    public RequireArgs(String action) {
        this.action = action;
    }
}
