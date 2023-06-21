package io.github.ealenxie.dingtalk.personnel.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/28 15:38
 * @version 1.0
 */
@Getter
@Setter
public class JobVO {

    /**
     * 职务ID
     */
    @JsonProperty("jobId")
    private String jobId;
    /**
     * 职务名称
     */
    @JsonProperty("jobName")
    private String jobName;
    /**
     * 职务描述
     */
    @JsonProperty("jobDescription")
    private String jobDescription;
}
