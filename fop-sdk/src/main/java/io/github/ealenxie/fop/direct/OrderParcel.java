package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 17:56
 */
@Getter
@Setter
public class OrderParcel {
    /**
     * 重量
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 长
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 宽
     */
    @JsonProperty("width")
    private Integer width;

    /**
     * 高
     */
    @JsonProperty("height")
    private Integer height;
}
