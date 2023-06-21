package io.github.ealenxie.kaufland.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/08/15 11:07
 */
@Getter
@Setter
public class Order {
    @JsonProperty("id_order")
    private String orderId;
    @JsonProperty("seller_units")
    private List<OrderUnit> orderUnits;
    @JsonProperty("ts_created")
    private String tsCreated;
    @JsonProperty("is_marketplace_deemed_supplier")
    private Boolean isMarketplaceDeemedSupplier;
}
