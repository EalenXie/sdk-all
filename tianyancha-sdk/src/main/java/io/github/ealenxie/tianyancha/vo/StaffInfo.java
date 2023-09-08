package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StaffInfo {
    /**
     * 人或公司id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 主要人员名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 职位
     */
    @JsonProperty("typeJoin")
    private List<String> typeJoin;

    /**
     * 1-公司 2-人
     */
    @JsonProperty("type")
    private Integer type;
}
