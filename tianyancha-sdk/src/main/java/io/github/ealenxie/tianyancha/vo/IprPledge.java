package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IprPledge {
    /**
     * 注销日期
     */
    @JsonProperty("cancleDate")
    private String cancleDate;

    /**
     * 质权登记期限
     */
    @JsonProperty("pledgeRegPeriod")
    private String pledgeRegPeriod;

    /**
     * 知识产权登记证号
     */
    @JsonProperty("iprCertificateNum")
    private String iprCertificateNum;

    /**
     * 变更记录列表
     */
    @JsonProperty("changeList")
    private List<Change> changeList;

    /**
     * 公示日期
     */
    @JsonProperty("publicityDate")
    private String publicityDate;

    /**
     * 质权人名称
     */
    @JsonProperty("pledgeeName")
    private String pledgeeName;

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
     * 出质人名称
     */
    @JsonProperty("pledgorName")
    private String pledgorName;

    /**
     * 名称
     */
    @JsonProperty("iprName")
    private String iprName;

    /**
     * 种类
     */
    @JsonProperty("iprType")
    private String iprType;

    /**
     * 注销原因
     */
    @JsonProperty("cancleReason")
    private String cancleReason;
}
