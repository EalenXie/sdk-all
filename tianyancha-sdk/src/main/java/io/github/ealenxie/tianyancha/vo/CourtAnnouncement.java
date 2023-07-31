package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourtAnnouncement {
    /**
     * 原告
     */
    @JsonProperty("party1")
    private String party1;

    /**
     * 原因
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * 公告号
     */
    @JsonProperty("bltnno")
    private String bltnno;

    /**
     * 当事人
     */
    @JsonProperty("party2")
    private String party2;

    /**
     * 公告状态号
     */
    @JsonProperty("bltnstate")
    private String bltnstate;

    /**
     * 处理等级名称
     */
    @JsonProperty("dealgradename")
    private String dealgradename;

    /**
     * 法官电话
     */
    @JsonProperty("judgephone")
    private String judgephone;

    /**
     * 案件号
     */
    @JsonProperty("caseno")
    private String caseno;

    /**
     * 公告类型名称
     */
    @JsonProperty("bltntypename")
    private String bltntypename;

    /**
     * 案件内容
     */
    @JsonProperty("content")
    private String content;

    /**
     * 处理等级
     */
    @JsonProperty("dealgrade")
    private String dealgrade;

    /**
     * 公告类型
     */
    @JsonProperty("bltntype")
    private String bltntype;

    /**
     * 法院名
     */
    @JsonProperty("courtcode")
    private String courtcode;

    /**
     * 省份
     */
    @JsonProperty("province")
    private String province;

    /**
     * 手机号
     */
    @JsonProperty("mobilephone")
    private String mobilephone;

    /**
     * 刊登版面
     */
    @JsonProperty("publishpage")
    private String publishpage;

    /**
     * 刊登日期
     */
    @JsonProperty("publishdate")
    private String publishdate;

    /**
     * id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 法官
     */
    @JsonProperty("judge")
    private String judge;
}