package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 11:29
 */
@Getter
@Setter
public class CrossBorderPayUrl {
    @JsonProperty("errorMsg")
    private String errorMsg;
    @JsonProperty("erroMsg")
    private String erroMsg;
    @JsonProperty("payUrl")
    private String payUrl;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("errorCode")
    private String errorCode;
    /**
     * 由于额度及风控原因不能批量支付的订单列表
     */
    @JsonProperty("cantPayOrderList")
    private List<Long> cantPayOrderList;

    public String getErrorMessage() {
        return ObjectUtils.isEmpty(errorMsg) ? erroMsg : errorMsg;
    }
}
