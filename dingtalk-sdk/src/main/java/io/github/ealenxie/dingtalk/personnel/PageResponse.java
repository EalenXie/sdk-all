package io.github.ealenxie.dingtalk.personnel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/28 14:13
 * @version 1.0
 */
@Getter
@Setter
public class PageResponse<T> {
    /**
     * 分页游标
     */
    @JsonProperty("nextToken")
    private Integer nextToken;
    /**
     * 是否有更多数据。
     * true：是
     * false：否
     */
    @JsonProperty("hasMore")
    private Boolean hasMore;
    /**
     * 返回数据
     */
    @JsonProperty("list")
    private List<T> list;

}
