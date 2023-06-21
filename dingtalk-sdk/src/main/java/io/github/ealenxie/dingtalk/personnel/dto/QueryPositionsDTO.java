package io.github.ealenxie.dingtalk.personnel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 获取企业职位列表请求参数
 *
 * @author create by sch  2023/4/28 14:03
 * @version 1.0
 */
@Getter
@Setter
public class QueryPositionsDTO {

    /**
     * 职位名称
     */
    @JsonProperty("positionName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String positionName;
    /**
     * 职位类别ID列表
     */
    @JsonProperty("inCategoryIds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> inCategoryIds;
    /**
     * 职位ID列表
     */
    @JsonProperty("inPositionIds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> inPositionIds;
    /**
     * 部门ID
     */
    @JsonProperty("deptId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long deptId;

}
