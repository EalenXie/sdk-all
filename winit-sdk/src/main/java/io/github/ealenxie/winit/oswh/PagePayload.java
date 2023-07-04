package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 10:24
 * @version 1.0
 */
@Getter
@Setter
public class PagePayload {
    /**
     * 页码 默认第一页
     */
    @JsonProperty("pageNo")
    private Integer pageNo = 1;
    /**
     * 每页条数,默认10条
     */
    @JsonProperty("pageSize")
    private Integer pageSize = 10;
}
