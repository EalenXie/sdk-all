package io.github.ealenxie.dingtalk.addressbook;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/11 13:54
 **/
@Getter
@Setter
public class RoleListRequest {
    /**
     * 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量，偏移量从0开始
     */
    private Long offset;
    /**
     * 支持分页查询，与offset参数同时设置时才生效，此参数代表分页大小，默认值20，最大值200
     */
    private Long size;
}

