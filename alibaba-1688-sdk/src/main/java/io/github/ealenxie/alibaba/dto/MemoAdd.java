package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 10 46
 */
@Getter
@Setter
public class MemoAdd {
    /**
     * 订单ID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderId")
    private Long orderId;
    /**
     * 备忘信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memo")
    private String memo;
    /**
     * 备忘图标，目前仅支持数字。1位红色图标，2为蓝色图标，3为绿色图标，4为黄色图标
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarkIcon")
    private String remarkIcon;
}
