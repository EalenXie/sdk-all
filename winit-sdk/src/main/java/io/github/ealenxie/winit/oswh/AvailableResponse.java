package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 17:17
 * @version 1.0
 */
@Getter
@Setter
public class AvailableResponse {

    /**
     * merchandiseNameCn
     */
    @JsonProperty("merchandiseNameCn")
    private String merchandiseNameCn;
    /**
     * winitMerchandiseCode
     */
    @JsonProperty("winitMerchandiseCode")
    private String winitMerchandiseCode;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * merchandiseName
     */
    @JsonProperty("merchandiseName")
    private String merchandiseName;
    /**
     * merchandiseCode
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
}
