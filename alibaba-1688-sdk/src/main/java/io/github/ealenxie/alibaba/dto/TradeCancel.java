package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 10 57
 */
@Getter
@Setter
public class TradeCancel {
    /**
     * 站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("webSite")
    private String webSite;
    /**
     * 交易id，订单号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tradeID")
    private Long tradeID;
    /**
     * 原因描述；buyerCancel:买家取消订单;sellerGoodsLack:卖家库存不足;other:其它
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("cancelReason")
    private String cancelReason;
    /**
     * 备注
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("remark")
    private String remark;
}
