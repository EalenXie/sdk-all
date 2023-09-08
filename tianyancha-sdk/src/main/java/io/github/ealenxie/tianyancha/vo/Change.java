package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Change {
    /**
     * 变更时间
     */
    @JsonProperty("changeTime")
    private String changeTime;

    /**
     * 变更后
     */
    @JsonProperty("contentAfter")
    private String contentAfter;

    /**
     * 变更前
     */
    @JsonProperty("contentBefore")
    private String contentBefore;

    /**
     * 表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 变更事项
     */
    @JsonProperty("changeItem")
    private String changeItem;
}
