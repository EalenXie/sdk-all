package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/9 12:30
 */
@Getter
@Setter
public class ResponsePage<T> extends ResponseAsk<T> {
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("nextPage")
    private String nextPage;
    @JsonProperty("pagination")
    private Pagination pagination;
}
