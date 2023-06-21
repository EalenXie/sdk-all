package io.github.ealenxie.dingtalk.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/12 10:57
 **/
@Getter
@Setter
public class OrgDeptVo {

    /**
     * 部门ID
     */
    @JsonProperty("dept_id")
    private Long deptId;
    /**
     * 部门名称
     */
    private String name;
}

