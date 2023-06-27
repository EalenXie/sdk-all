package io.github.ealenxie.goodcang;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/22 13:17
 */
@Getter
@Setter
public class Pagination {
    /**
     * 当前页
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页数据长度
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
}
