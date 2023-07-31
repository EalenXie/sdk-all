package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutBound {
    /**
     * 对外投资企业名称
     */
    @JsonProperty("outcompanyName")
    private String outcompanyName;

    /**
     * 统一信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;

    /**
     * 注册号
     */
    @JsonProperty("regNum")
    private String regNum;
}