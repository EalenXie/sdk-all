package io.github.ealenxie.winit.oswh.outbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 13:23
 * @version 1.0
 */
@Getter
@Setter
public class PageParamsVO {
    /**
     * 当前每页记录数
     */
    @JsonProperty("currentPageSize")
    private Integer currentPageSize;
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 当前页码
     */
    @JsonProperty("currentPageNo")
    private Integer currentPageNo;
}