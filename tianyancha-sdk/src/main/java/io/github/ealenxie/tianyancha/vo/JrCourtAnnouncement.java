package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/14 10:03
 */
@Getter
@Setter
public class JrCourtAnnouncement {
    /**
     * ID
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 公告ID
     */
    @JsonProperty("announce_id")
    private Long announceId;
    /**
     * 公告号
     */
    @JsonProperty("bltnno")
    private String bltnNo;
    /**
     * 公告状态号
     */
    @JsonProperty("bltnstate")
    private String bltnState;

    /**
     * 公告类型
     */
    @JsonProperty("bltntype")
    private String bltnType;

    /**
     * 公告类型名称
     */
    @JsonProperty("bltntypename")
    private String bltnTypeName;

    /**
     * 案件号
     */
    @JsonProperty("caseno")
    private String caseNo;

    /**
     * 案件内容
     */
    @JsonProperty("content")
    private String content;

    /**
     * 法院名
     */
    @JsonProperty("courtcode")
    private String courtCode;

    /**
     * 处理等级
     */
    @JsonProperty("dealgrade")
    private String dealGrade;

    /**
     * 处理等级名称
     */
    @JsonProperty("dealgradename")
    private String dealGradeName;

    /**
     * 法官
     */
    @JsonProperty("judge")
    private String judge;

    /**
     * 法官电话
     */
    @JsonProperty("judgephone")
    private String judgePhone;

    /**
     * 手机号
     */
    @JsonProperty("mobilephone")
    private String mobilePhone;

    /**
     * 原告
     */
    @JsonProperty("party1")
    private String party1;

    /**
     * 当事人
     */
    @JsonProperty("party2")
    private String party2;

    /**
     * 公司列表
     */
    @JsonProperty("companyList")
    private List<NameIdType> companyList;

    /**
     * 省份
     */
    @JsonProperty("province")
    private String province;

    /**
     * 刊登日期
     */
    @JsonProperty("publishdate")
    private String publishDate;

    /**
     * 刊登版面
     */
    @JsonProperty("publishpage")
    private String publishPage;

    /**
     * 案由
     */
    @JsonProperty("reason")
    private String reason;
}
