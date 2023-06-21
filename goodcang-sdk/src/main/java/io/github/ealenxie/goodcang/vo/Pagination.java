package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/22 13:17
 */
@Getter
@Setter
public class Pagination {
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("pageSize")
    private Integer pageSize;
}
