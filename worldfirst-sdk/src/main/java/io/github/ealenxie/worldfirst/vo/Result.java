package io.github.ealenxie.worldfirst.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 8:42
 */
@Getter
@Setter
public class Result {
    /**
     * 结果码，取值范围见各API页。
     */
    private String resultCode;
    /**
     * 结果信息，结果码的补充信息。
     */
    private String resultMessage;
    /**
     * 结果状态，取值范围：
     * S：成功
     * F：失败
     * U：未知
     */
    private String resultStatus;
}
