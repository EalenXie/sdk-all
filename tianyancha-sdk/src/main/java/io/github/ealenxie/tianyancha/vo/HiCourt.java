package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/18 14:30
 */
@Getter
@Setter
public class HiCourt {
    /**
     * 公告类型名称
     */
    @JsonProperty("bltntypename")
    private String bltntypename;

    /**
     * 法院名
     */
    @JsonProperty("courtcode")
    private String courtcode;

    /**
     * 刊登日期
     */
    @JsonProperty("publishdate")
    private String publishdate;

    /**
     * 公告ID
     */
    @JsonProperty("announce_id")
    private Long announceId;

    /**
     * 案件内容
     */
    @JsonProperty("content")
    private String content;

    /**
     * 对应表ID
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 联系方式
     */
    @JsonProperty("mobilephone")
    private String mobilephone;

    /**
     * 刊登版面
     */
    @JsonProperty("publishpage")
    private String publishpage;

    /**
     * 法官电话
     */
    @JsonProperty("judgephone")
    private String judgephone;

    /**
     * 原告
     */
    @JsonProperty("party1")
    private String party1;

    /**
     * 相关公司列表
     */
    @JsonProperty("companyList")
    private List<NameIdType> companyList;

    /**
     * 省份
     */
    @JsonProperty("province")
    private String province;

    /**
     * 唯一标识符
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * 当事人
     */
    @JsonProperty("party2")
    private String party2;

    /**
     * 公告号
     */
    @JsonProperty("bltnno")
    private String bltnno;

    /**
     * 案件号
     */
    @JsonProperty("caseno")
    private String caseno;

    /**
     * 原告（字符串类型）
     */
    @JsonProperty("party1Str")
    private String party1Str;

    /**
     * 当事人（字符串类型）
     */
    @JsonProperty("party2Str")
    private String party2Str;
}
