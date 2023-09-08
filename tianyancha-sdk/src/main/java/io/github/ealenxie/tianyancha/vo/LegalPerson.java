package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/1 13:34
 */
@Getter
@Setter
public class LegalPerson {
    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 公司id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 人员hcgid
     */
    @JsonProperty("hcgid")
    private String hcgid;

    /**
     * 卸任时间
     */
    @JsonProperty("time")
    private String time;
}
