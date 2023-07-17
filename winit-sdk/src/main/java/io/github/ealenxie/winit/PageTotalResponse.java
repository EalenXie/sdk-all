package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 13:16
 * @version 1.0
 */
@Getter
@Setter
public class PageTotalResponse {
    /**
     * 每页显示数量，默认和最大200
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
    /**
     * 页码，第几页，默认1
     */
    @JsonProperty("pageNo")
    private Integer pageNo;

    @JsonProperty("totalCount")
    private Integer totalCount;
}
