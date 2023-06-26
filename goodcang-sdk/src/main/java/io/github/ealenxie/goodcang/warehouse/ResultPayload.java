package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:43
 */
@Getter
@Setter
public class ResultPayload {

    /**
     * 响应内容
     */
    @JsonProperty("result")
    private String result;
}
