package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Mort {
    /**
     * 被担保债权数额
     */
    @JsonProperty("amount")
    private String amount;

    /**
     * 注销日期
     */
    @JsonProperty("cancelDate")
    private String cancelDate;

    /**
     * 抵押物列表
     */
    @JsonProperty("pawnList")
    private List<Pawn> pawnList;

    /**
     * 变更列表
     */
    @JsonProperty("changeList")
    private List<Change> changeList;

    /**
     * 公示日期
     */
    @JsonProperty("publishDate")
    private String publishDate;

    /**
     * 登记日期
     */
    @JsonProperty("regDate")
    private String regDate;

    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 被担保债权种类
     */
    @JsonProperty("type")
    private String type;

    /**
     * 登记编号
     */
    @JsonProperty("regNum")
    private String regNum;

    /**
     * 登记机关
     */
    @JsonProperty("regDepartment")
    private String regDepartment;

    /**
     * 担保范围
     */
    @JsonProperty("scope")
    private String scope;

    /**
     * 债务人履行债务的期限
     */
    @JsonProperty("term")
    private String term;

    /**
     * 表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 注销原因
     */
    @JsonProperty("cancelReason")
    private String cancelReason;

    /**
     * 省份简称
     */
    @JsonProperty("base")
    private String base;

    /**
     * 状态
     */
    @JsonProperty("status")
    private String status;
}