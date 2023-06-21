package io.github.ealenxie.dingtalk.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/10 14:46
 **/
@Getter
@Setter
public class DepartmentListsubRequest {
    /**
     * 父部门ID。
     * 企业内部应用，调用获取部门列表接口获取dept_id参数值。
     * 第三方企业应用，调用获取部门列表接口获取dept_id参数值
     */
    @JsonProperty("dept_id")
    private Long deptId;
    /**
     * 通讯录语言：
     * zh_CN（默认）：中文
     * en_US：英文
     */
    private String language;
}

