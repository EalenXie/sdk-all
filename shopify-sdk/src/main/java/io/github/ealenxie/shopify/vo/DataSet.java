package io.github.ealenxie.shopify.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DataSet {

    @JsonProperty("shop_money")
    private Money shopMoney;
    @JsonProperty("presentment_money")
    private Money presentmentMoney;

}
