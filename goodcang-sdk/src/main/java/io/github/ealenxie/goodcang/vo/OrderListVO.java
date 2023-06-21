package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/22 13:17
 */
@Getter
@Setter
public class OrderListVO {

    @JsonProperty("ask")
    private String ask;
    @JsonProperty("message")
    private String message;
    @JsonProperty("errCode")
    private String errCode;
    @JsonProperty("data")
    private List<Order> data;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("nextPage")
    private String nextPage;
    @JsonProperty("pagination")
    private Pagination pagination;
}
