package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pawn {
    /**
     * 名称
     */
    @JsonProperty("pawnName")
    private String pawnName;

    /**
     * 所有权归属
     */
    @JsonProperty("ownership")
    private String ownership;

    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 数量、质量、状况、所在地等情况
     */
    @JsonProperty("detail")
    private String detail;
}
