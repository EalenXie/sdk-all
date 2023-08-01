package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/8/1 12:48
 */
@Getter
@Setter
public class IcVerify {
    /**
     * 验证结果，0-验证失败，1-验证成功，2-输入企业名疑似曾用名，其他两要素一致
     */
    @JsonProperty("result")
    private int result;

    /**
     * 描述
     */
    @JsonProperty("remark")
    private String remark;
}
