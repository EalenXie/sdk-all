package io.github.ealenxie.dingtalk.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/11 13:35
 **/
@Getter
@Setter
public class ParentIdsResponse {
    /**
     * 该部门的所有父部门ID列表。
     * 获取的list元素第一个是当前部门ID，最后一个是父部门ID，从左至右部门层级递增
     */
    @JsonProperty("parent_id_list")
    private List<Long> parentIdList;
}

