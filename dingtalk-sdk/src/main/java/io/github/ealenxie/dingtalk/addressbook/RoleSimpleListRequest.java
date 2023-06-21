package io.github.ealenxie.dingtalk.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/12 11:29
 **/
@Getter
@Setter
public class RoleSimpleListRequest {
    /**
     * 分页偏移量
     * 与size参数同时设置时才生效，此参数代表偏移量，偏移量从0开始
     */
    private Long offset;
    /**
     * 角色roleId，可通过以下方式获取：
     * 企业内部应用，调用获取角色列表接口获取id参数值。
     * 第三方企业应用，调用获取角色列表接口获取id参数值
     */
    @JsonProperty("role_id")
    private Long roleId;
    /**
     * 分页大小
     * 与offset参数同时设置时才生效，此参数代表分页大小，默认值20，最大100
     */
    private Long size;
}

