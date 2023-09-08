package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Staff {
    /**
     * 主要人员职位
     */
    @JsonProperty("staffTypeName")
    private String staffTypeName;

    /**
     * 主要人员名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 主要人员类型 1-公司 2-人
     */
    @JsonProperty("type")
    private Integer type;

    /**
     * 职位列表
     */
    @JsonProperty("typeJoin")
    private List<String> typeJoin;
}
