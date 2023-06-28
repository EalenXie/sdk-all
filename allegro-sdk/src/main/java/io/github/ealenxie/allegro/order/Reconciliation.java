package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class Reconciliation {
    /**
     * 价格
     */
    @JsonProperty("value")
    private Money value;
    /**
     * 类型
     * BILLING：对账值被计为账单中的新条目
     * WALLET：对账值被添加到结帐表单付款中
     */
    @JsonProperty("type")
    private String type;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
