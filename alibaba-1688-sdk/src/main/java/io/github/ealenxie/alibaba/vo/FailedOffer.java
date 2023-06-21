package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/5/12 14:11
 * @version 1.0
 */
@Getter
@Setter
public class FailedOffer {
    /**
     * 下单失败的商品
     */
    @JsonProperty("offerId")
    private String offerId;
    /**
     * 下单失败商品的规格ID
     */
    @JsonProperty("specId")
    private String specId;
    /**
     * 下单失败的错误编码
     */
    @JsonProperty("errorCode")
    private String errorCode;
    /**
     * 下单失败的错误描述
     */
    @JsonProperty("errorMessage")
    private String errorMessage;
}
