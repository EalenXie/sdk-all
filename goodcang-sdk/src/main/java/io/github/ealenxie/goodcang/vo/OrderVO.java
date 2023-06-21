package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/22 13:17
 */
@Getter
@Setter
public class OrderVO {

    @JsonProperty("ask")
    private String ask;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private Order data;

}
