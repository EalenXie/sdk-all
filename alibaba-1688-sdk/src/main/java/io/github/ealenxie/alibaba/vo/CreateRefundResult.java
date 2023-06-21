package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 40
 */
@Getter
@Setter
public class CreateRefundResult {

    /**
     * 创建成功，退款id
     */
    @JsonProperty("refundId")
    private String refundId;

}
