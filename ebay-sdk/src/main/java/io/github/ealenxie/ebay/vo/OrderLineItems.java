package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/31 14:19
 */
@Getter
@Setter
public class OrderLineItems {
    /**
     * 订单行项的唯一标识符
     */
    @JsonProperty("lineItemId")
    private String lineItemId;
    /**
     * 订单行项目应计费用的总额
     */
    @JsonProperty("feeBasisAmount")
    private Amount feeBasisAmount;
    /**
     * 订单行项的费用
     */
    @JsonProperty("marketplaceFees")
    private List<MarketplaceFees> marketplaceFees;
}
