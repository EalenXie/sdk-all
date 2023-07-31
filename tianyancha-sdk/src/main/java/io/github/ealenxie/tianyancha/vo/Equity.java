package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Equity {
    /**
     * 注销日期
     */
    @JsonProperty("cancelDate")
    private String cancelDate;

    /**
     * 股权出质设立登记日期
     */
    @JsonProperty("regDate")
    private String regDate;

    /**
     * 出质人
     */
    @JsonProperty("pledgor")
    private String pledgor;

    /**
     * 质权人证照/证件号码
     */
    @JsonProperty("certifNumberR")
    private String certifNumberR;

    /**
     * 质权人
     */
    @JsonProperty("pledgee")
    private String pledgee;

    /**
     * 登记编号
     */
    @JsonProperty("regNumber")
    private String regNumber;

    /**
     * 出质人证照/证件号码
     */
    @JsonProperty("certifNumber")
    private String certifNumber;

    /**
     * 出质股权标的企业
     */
    @JsonProperty("targetCompany")
    private String targetCompany;

    /**
     * 出质股权数额
     */
    @JsonProperty("equityAmount")
    private String equityAmount;

    /**
     * 表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 状态
     */
    @JsonProperty("state")
    private String state;

    /**
     * 注销原因
     */
    @JsonProperty("cancelReason")
    private String cancelReason;

    /**
     * 股权出质设立发布日期
     */
    @JsonProperty("putDate")
    private String putDate;
}
