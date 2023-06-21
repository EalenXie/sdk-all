package io.github.ealenxie.dingtalk.personnel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/28 15:16
 * @version 1.0
 */
@Getter
@Setter
public class QueryJobRanksDTO extends PageDTO {
    /**
     * 职级序列ID
     */
    @JsonProperty("rankCategoryId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rankCategoryId;
    /**
     * 职级编码
     */
    @JsonProperty("rankCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rankCode;
    /**
     * 职级名称
     */
    @JsonProperty("rankName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rankName;
}
