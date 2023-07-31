package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LiquidatingInfo {
    /**
     * 清算组负责人
     */
    @JsonProperty("manager")
    private String manager;

    /**
     * 清算成员名称
     */
    @JsonProperty("member")
    private String member;

    /**
     * 表id
     */
    @JsonProperty("id")
    private Long id;
}
