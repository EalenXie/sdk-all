package io.github.ealenxie.dingtalk.addressbook;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/11 14:02
 **/
@Getter
@Setter
public class OpenRoleGroup {
    /**
     * 角色组ID
     */
    private Long groupId;
    /**
     * 角色组名称
     */
    private String name;
    /**
     * 角色列表
     */
    private List<OpenRole> roles;
}

