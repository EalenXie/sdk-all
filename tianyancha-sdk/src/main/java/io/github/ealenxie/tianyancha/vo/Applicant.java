package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Applicant {
    /**
     * 申请人gid
     */
    @JsonProperty("applicantGid")
    private Long applicantGid;

    /**
     * 申请人名称
     */
    @JsonProperty("applicantName")
    private String applicantName;
}