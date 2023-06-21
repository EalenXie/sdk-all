package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/16 10:55
 */
@Getter
@Setter
public class AlipayUrl {
    @JsonProperty("erroMsg")
    private String erroMsg;
    @JsonProperty("payUrl")
    private String payUrl;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("errorCode")
    private String errorCode;
}
