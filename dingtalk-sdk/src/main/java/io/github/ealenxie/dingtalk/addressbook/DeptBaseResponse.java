package io.github.ealenxie.dingtalk.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/10 14:55
 **/
@Getter
@Setter
public class DeptBaseResponse {
    /**
     * 部门群已经创建后，有新人加入部门是否会自动加入该群：
     * true：会自动入群
     * false：不会
     */
    @JsonProperty("auto_add_user")
    private Boolean autoAddUser;
    /**
     * 是否同步创建一个关联此部门的企业群：
     * true：创建
     * false：不创建
     */
    @JsonProperty("create_dept_group")
    private Boolean createDeptGroup;
    /**
     * 部门ID
     */
    @JsonProperty("dept_id")
    private Long deptId;
    /**
     *
     */
    @JsonProperty("ext")
    private String ext;
    /**
     *
     */
    @JsonProperty("from_union_org")
    private Boolean fromUnionOrg;
    /**
     * 部门名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 父部门ID
     */
    @JsonProperty("parent_id")
    private Long parentId;
    /**
     *
     */
    @JsonProperty("source_identifier")
    private String sourceIdentifier;
    /**
     *
     */
    @JsonProperty("tags")
    private String tags;
}

