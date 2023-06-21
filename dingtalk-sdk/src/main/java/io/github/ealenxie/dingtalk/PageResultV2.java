package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/10 14:51
 **/
@Getter
@Setter
public class PageResultV2<T> {
    /**
     * 结果集
     */
    private List<T> list;
    /**
     * 下一次分页的游标
     */
    @JsonProperty("next_cursor")
    private String nextCursor;
    /**
     * 是否还有更多的数据：
     * true：有
     * false：没有
     */
    @JsonProperty("hasMore")
    private Boolean hasMore = false;
}

