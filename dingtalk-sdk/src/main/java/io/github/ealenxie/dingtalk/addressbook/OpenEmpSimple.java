package io.github.ealenxie.dingtalk.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/12 10:23
 **/
@Getter
@Setter
public class OpenEmpSimple {
    /**
     * 管理范围
     */
    @JsonProperty("org_dept_vo")
    private List<OrgDeptVo> manageScopes;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工的userid
     */
    private String userid;
}

