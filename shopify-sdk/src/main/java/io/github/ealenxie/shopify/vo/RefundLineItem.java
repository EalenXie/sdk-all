package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class RefundLineItem {


    /**
     * id
     **/
    @JsonProperty("id")
    private Long id;
    /**
     * 订单项id
     **/
    @JsonProperty("line_item_id")
    private Long lineItemId;
    /**
     * 位置id
     **/
    @JsonProperty("location_id")
    private Long locationId;
    /**
     * 数量
     **/
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 进货类型
     **/
    @JsonProperty("restock_type")
    private String restockType;
    /**
     * 小计
     **/
    @JsonProperty("subtotal")
    private BigDecimal subtotal;
    /**
     * 小计集
     **/
    @JsonProperty("subtotal_set")
    private DataSet subtotalSet;
    /**
     * 总税额
     **/
    @JsonProperty("total_tax")
    private BigDecimal totalTax;
    /**
     * 总税额集
     **/
    @JsonProperty("total_tax_set")
    private DataSet totalTaxSet;
    /**
     * 订单详情
     **/
    @JsonProperty("line_item")
    private LineItem lineItem;

}
