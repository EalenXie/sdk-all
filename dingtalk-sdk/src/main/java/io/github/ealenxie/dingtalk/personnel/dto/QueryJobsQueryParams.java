package io.github.ealenxie.dingtalk.personnel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/28 15:37
 * @version 1.0
 */
@Getter
@Setter
public class QueryJobsQueryParams extends PageQueryParams {
    /**
     * 职务名称
     */
    @JsonProperty("jobName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String jobName;
}
