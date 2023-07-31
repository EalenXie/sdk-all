package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Zhixing {
    /**
     * 案号
     */
    @JsonProperty("caseCode")
    private String caseCode;

    /**
     * 身份证号/组织机构代码
     */
    @JsonProperty("partyCardNum")
    private String partyCardNum;

    /**
     * 被执行人名称
     */
    @JsonProperty("pname")
    private String pname;

    /**
     * 执行法院
     */
    @JsonProperty("execCourtName")
    private String execCourtName;

    /**
     * 创建时间
     */
    @JsonProperty("caseCreateTime")
    private String caseCreateTime;

    /**
     * 对应表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 执行标的
     */
    @JsonProperty("execMoney")
    private String execMoney;


}
