package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/11 9:30
 */
@Getter
@Setter
public class HiIc {

    /**
     * 注册地址列表
     */
    @JsonProperty("locationList")
    private List<IcInfo> locationList;
    /**
     * 统一信用代码列表
     */
    @JsonProperty("creditCodeList")
    private List<IcInfo> creditCodeList;
    /**
     * 分支机构名称
     */
    @JsonProperty("pastBranchList")
    private List<List<IcInfo>> pastBranchList;
    /**
     * 商业范围
     */
    @JsonProperty("businessScopeList")
    private List<IcInfo> businessScopeList;
    /**
     * 公司类型
     */
    @JsonProperty("typeList")
    private List<IcInfo> typeList;
    /**
     * 历史组织机构备案列表
     */
    @JsonProperty("orgNumberList")
    private List<IcInfo> orgNumberList;
    /**
     * 经营期限列表
     */
    @JsonProperty("deadLineList")
    private List<IcInfo> deadLineList;
    /**
     * 注册资本列表
     */
    @JsonProperty("regCapitalList")
    private List<IcInfo> regCapitalList;
    /**
     * 注册号列表
     */
    @JsonProperty("regNumberList")
    private List<IcInfo> regNumberList;
    /**
     * 历史名称
     */
    @JsonProperty("historyNameList")
    private List<IcInfo> historyNameList;
    /**
     * 董监高列表
     */
    @JsonProperty("pastStafferList")
    private List<IcInfo> pastStafferList;
    /**
     * 历史法人列表
     */
    @JsonProperty("pastLegalPersonList")
    private List<IcInfo> pastLegalPersonList;
    /**
     * 总数
     */
    @JsonProperty("total")
    private Integer total;
}
