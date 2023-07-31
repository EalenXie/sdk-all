package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BriefCancel {
    /**
     * 登记机关
     */
    @JsonProperty("reg_authority")
    private String regAuthority;

    /**
     * 异议列表
     */
    @JsonProperty("objectionList")
    private List<Objection> objectionList;

    /**
     * 公告申请日期
     */
    @JsonProperty("announcement_apply_date")
    private String announcementApplyDate;

    /**
     * 注册号
     */
    @JsonProperty("reg_num")
    private String regNum;

    /**
     * 公司名
     */
    @JsonProperty("company_name")
    private String companyName;

    /**
     * 统一社会信用代码
     */
    @JsonProperty("credit_code")
    private String creditCode;

    /**
     * 公告id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 简易注销结果
     */
    @JsonProperty("brief_cancel_result")
    private String briefCancelResult;

    /**
     * 公告期
     */
    @JsonProperty("announcement_term")
    private String announcementTerm;

    /**
     * 原链接
     */
    @JsonProperty("investor_commitment_download_url")
    private String investorCommitmentDownloadUrl;

    /**
     * 公告结束日期
     */
    @JsonProperty("announcement_end_date")
    private String announcementEndDate;

    /**
     * oss路径
     */
    @JsonProperty("ossPath")
    private String ossPath;
}
