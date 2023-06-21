package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 50
 */
@Getter
@Setter
public class OrderRefundReasons {
    /**
     * 原因列表
     */
    @JsonProperty("reasons")
    private List<OrderRefundReason> reasons;
}
