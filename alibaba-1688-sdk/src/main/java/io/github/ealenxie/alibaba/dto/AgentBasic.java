package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 14:58
 */
@Getter
@Setter
public class AgentBasic {
    /**
     * 用户的loginId，入参不可同时为空
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("loginId")
    private String loginId;
    /**
     * 旺铺域名，入参不可同时为空
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("domain")
    private String domain;
}
