package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/14 15:32
 */
@Setter
@Getter
public class Response<T> {

    private T result;

    private String reason;

    @JsonProperty("error_code")
    private Integer errorCode;
}
