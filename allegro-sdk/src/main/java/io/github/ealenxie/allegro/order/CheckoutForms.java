package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * Created by EalenXie on 2022/2/21 15:59
 */
@Getter
@Setter
public class CheckoutForms {
    /**
     * 订单信息
     */
    @JsonProperty("checkoutForms")
    private List<CheckoutForm> checkoutFormList;
    /**
     * 数量
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * 总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;

}
