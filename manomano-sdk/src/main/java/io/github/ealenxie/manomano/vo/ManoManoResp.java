package io.github.ealenxie.manomano.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/16 9:40
 */
@Getter
@Setter
public class ManoManoResp<T> {
    private String code;
    private String message;
    @JsonProperty("datas")
    private T data;
}
