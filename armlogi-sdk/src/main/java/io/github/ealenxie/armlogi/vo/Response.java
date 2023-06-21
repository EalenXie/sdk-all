package io.github.ealenxie.armlogi.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * Created on 2023/3/28 15:29
 **/
@Getter
@Setter
public class Response<T> {
    private String code;
    private T result;
    private String message;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("0", code);
    }
}

