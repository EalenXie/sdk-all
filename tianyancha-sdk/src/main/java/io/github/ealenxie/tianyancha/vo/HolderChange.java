package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/6 14:53
 */
@Getter
@Setter
public class HolderChange {
    /**
     * 公司id
     */
    @JsonProperty("gid")
    private Long gid;

    /**
     * 股东名
     */
    @JsonProperty("investor_name")
    private String investorName;

    /**
     * 变更后
     */
    @JsonProperty("ratio_after")
    private String ratioAfter;

    /**
     * Logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 变更前
     */
    @JsonProperty("ratio_before")
    private String ratioBefore;

    /**
     * 股东id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 类型，1-公司 2-人
     */
    @JsonProperty("type")
    private Integer type;

    /**
     * 变更时间
     */
    @JsonProperty("change_time")
    private Long changeTime;
}
