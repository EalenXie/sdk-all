package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeRecord {
    /**
     * 修改日期
     */
    @JsonProperty("changeTime")
    private String changeTime;

    /**
     * 修改后
     */
    @JsonProperty("contentAfter")
    private String contentAfter;

    /**
     * 修改前
     */
    @JsonProperty("contentBefore")
    private String contentBefore;

    /**
     * 修改事项
     */
    @JsonProperty("changeItem")
    private String changeItem;

    /**
     * 年报年份
     */
    @JsonProperty("reportYear")
    private String reportYear;
}
