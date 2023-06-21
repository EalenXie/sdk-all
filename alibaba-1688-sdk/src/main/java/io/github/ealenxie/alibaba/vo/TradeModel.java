package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 10:20
 */
@Setter
@Getter
public class TradeModel {
    /**
     * 交易方式名称，1688下单预览页面展示的名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 交易描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 做为入参传入下单接口的tradeType字段
     */
    @JsonProperty("tradeType")
    private String tradeType;
    /**
     * 开放平台下单是否支持此种交易模式。如果为true,该交易方式可做为下单接口tradeType参数的入参；如果为false,则不可做为下单接口的入参。
     */
    @JsonProperty("opSupport")
    private Boolean opSupport;

}
