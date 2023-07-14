package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:52
 * @version 1.0
 */
@Getter
@Setter
public class PackItem {
    /**
     * itemSerno
     */
    @JsonProperty("itemSerno")
    private String itemSerno;
}
