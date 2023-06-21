package io.github.ealenxie.dingtalk.personnel.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/28 15:34
 * @version 1.0
 */
@Getter
@Setter
public class JobRankVO {

    /**
     * 职级ID
     */
    @JsonProperty("rankId")
    private String rankId;
    /**
     * 职级序列ID
     */
    @JsonProperty("rankCategoryId")
    private String rankCategoryId;
    /**
     * 职级编码
     */
    @JsonProperty("rankCode")
    private String rankCode;
    /**
     * 职级名称
     */
    @JsonProperty("rankName")
    private String rankName;
    /**
     * 最小等级
     */
    @JsonProperty("minJobGrade")
    private Integer minJobGrade;
    /**
     * 最大等级
     */
    @JsonProperty("maxJobGrade")
    private Integer maxJobGrade;
    /**
     * 职级描述
     */
    @JsonProperty("rankDescription")
    private String rankDescription;
}
