package io.github.ealenxie.lianlian.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/7 13:55
 */
@Getter
@Setter
public class LianLianResp<T> {
    private static final String LIAN_LIAN_SUCCESS_CODE = "000000";
    private String code;
    private T data;

    public boolean isOk() {
        return LIAN_LIAN_SUCCESS_CODE.equals(code);
    }
}
