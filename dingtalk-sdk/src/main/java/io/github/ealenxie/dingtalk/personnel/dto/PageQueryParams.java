package io.github.ealenxie.dingtalk.personnel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/28 14:19
 * @version 1.0
 */
@Getter
@Setter
public class PageQueryParams {
    /**
     * 分页游标
     * 首次调用，该参数传0。
     * 非首次调用，该参数传上次调用本接口返回的nextToken。
     */
    @JsonProperty("nextToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer nextToken = 0;
    /**
     * 每页最大条目数，最大值200
     */
    @JsonProperty("maxResults")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer maxResults = 200;
}
