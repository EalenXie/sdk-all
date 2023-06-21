package io.github.ealenxie.dingtalk.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/10 16:44
 **/
@Getter
@Setter
public class UserListRequest {

    /**
     * 分页查询的游标，最开始传0，后续传返回参数中的next_cursor值
     */
    private Integer cursor = 0;
    /**
     * 分页大小
     */
    private Integer size;
    /**
     * 是否返回访问受限的员工：
     * true：返回
     * false：不返回
     */
    @JsonProperty("contain_access_limit")
    private Boolean containAccessLimit;
    /**
     * 部门成员的排序规则，默认不传是按自定义排序（custom）：
     * entry_asc：代表按照进入部门的时间升序
     * entry_desc：代表按照进入部门的时间降序
     * modify_asc：代表按照部门信息修改时间升序
     * modify_desc：代表按照部门信息修改时间降序
     * custom：代表用户定义(未定义时按照拼音)排序
     */
    @JsonProperty("order_field")
    private String orderField;
    /**
     * 通讯录语言，取值。
     * zh_CN：中文（默认值）。
     * en_US：英文
     */
    private String language;
    /**
     * 部门ID，可调用获取部门列表获取，如果是根部门，该参数传1
     */
    @JsonProperty("dept_id")
    private Long deptId;

}

