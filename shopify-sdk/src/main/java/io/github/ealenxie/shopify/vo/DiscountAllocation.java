package io.github.ealenxie.shopify.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DiscountAllocation {

    /**
     * 数量
     **/
    @JsonProperty("amount")
    private String amount;
    /**
     * 数量集
     **/
    @JsonProperty("amount_set")
    private DataSet amountSet;
    /**
     * 折扣App
     **/
    @JsonProperty("discount_application_index")
    private Integer discountApplicationIndex;

}
