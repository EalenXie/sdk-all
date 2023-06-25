package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 17:43
 */
@Getter
@Setter
public class PagePayload {
    /**
     * 每页数据长度
     */
    @JsonProperty("page_size")
    private Integer pageSize;
    /**
     * 当前页
     */
    @JsonProperty("page")
    private Integer page;
}
