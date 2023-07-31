package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/31 9:38
 */
@Getter
@Setter
public class NameIdType {
    /**
     * 人或公司名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 人或公司id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 1-公司 2-人
     */
    @JsonProperty("type")
    private Integer type;
}
