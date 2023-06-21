package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class LineItem {
    /**
     * 订单项标识号
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("offer")
    private Offer offer;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 原价
     */
    @JsonProperty("originalPrice")
    private Money originalPrice;
    /**
     * 价格
     */
    @JsonProperty("price")
    private Money price;
    /**
     * 协调价格
     */
    @JsonProperty("reconciliation")
    private Reconciliation reconciliation;
    /**
     * 附加服务
     */
    @JsonProperty("selectedAdditionalServices")
    private List<SelectedAdditionalService> selectedAdditionalServices;
    /**
     * 购买日期
     */
    @JsonProperty("boughtAt")
    private String boughtAt;
}
