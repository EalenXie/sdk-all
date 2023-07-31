package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Objection {
    /**
     * 异议内容
     */
    @JsonProperty("objection_content")
    private String objectionContent;

    /**
     * 异议时间
     */
    @JsonProperty("objection_date")
    private String objectionDate;

    /**
     * 异议申请人
     */
    @JsonProperty("objection_apply_person")
    private String objectionApplyPerson;
}
