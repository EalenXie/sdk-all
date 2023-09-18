package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/18 16:02
 */
@Getter
@Setter
public class Zhixinginfo {
    /**
     * 案号
     */
    @JsonProperty("caseCode")
    private String caseCode;

    /**
     * 执行法院
     */
    @JsonProperty("execCourtName")
    private String execCourtName;

    /**
     * 被执行人名称
     */
    @JsonProperty("pname")
    private String pname;

    /**
     * 身份证号／组织机构代码
     */
    @JsonProperty("partyCardNum")
    private String partyCardNum;

    /**
     * 创建时间
     */
    @JsonProperty("caseCreateTime")
    private Long caseCreateTime;

    /**
     * 执行标的（元）
     */
    @JsonProperty("execMoney")
    private String execMoney;
}
