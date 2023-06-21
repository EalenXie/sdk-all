package io.github.ealenxie.eccang.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月23日 0023 16 31
 */
@Getter
@Setter
public class VerifyPurchaseVO {

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private List<String> errorMsg;
}
