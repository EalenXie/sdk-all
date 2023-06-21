package io.github.ealenxie.dingtalk.personnel.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/28 14:12
 * @version 1.0
 */
@Getter
@Setter
public class PositionVO {
    /**
     * 职位ID
     */
    @JsonProperty("positionId")
    private String positionId;
    /**
     * 职位名称
     */
    @JsonProperty("positionName")
    private String positionName;
    /**
     * 职位类别ID
     */
    @JsonProperty("positionCategoryId")
    private String positionCategoryId;
    /**
     * 所属职务ID
     */
    @JsonProperty("jobId")
    private String jobId;
    /**
     * 职位描述
     */
    @JsonProperty("positionDes")
    private String positionDes;
    /**
     * 职级ID
     */
    @JsonProperty("rankIdList")
    private List<String> rankIdList;
    /**
     * 职位状态 0：启用。1：停用
     */
    @JsonProperty("status")
    private Integer status;
}
