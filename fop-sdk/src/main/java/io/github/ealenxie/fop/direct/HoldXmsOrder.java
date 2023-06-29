package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:23
 */
@Getter
@Setter
public class HoldXmsOrder {
    /**
     * 请求单号
     */
    @JsonProperty("request_no")
    private String requestNo;

    /**
     * 拦截指令
     * <p>
     * 可选值，拦截：Y；取消拦截：N
     */
    @JsonProperty("is_hold")
    private String isHold;

    /**
     * 拦截原因
     */
    @JsonProperty("hold_reason")
    private String holdReason;
}
