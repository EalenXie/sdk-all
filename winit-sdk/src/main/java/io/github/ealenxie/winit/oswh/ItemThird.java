package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 15:52
 * @version 1.0
 */
@Getter
@Setter
public class ItemThird {
    /**
     * 第三方编码
     */
    @JsonProperty("skuCodeThird")
    private String skuCodeThird;
    /**
     * 说明
     */
    @JsonProperty("description")
    private String description;
    @JsonProperty("isActive")
    private String isActive;
    @JsonProperty("isDelete")
    private String isDelete;
}
