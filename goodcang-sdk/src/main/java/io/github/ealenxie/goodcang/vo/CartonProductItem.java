package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/10/21 11:14
 */
@Getter
@Setter
public class CartonProductItem {


    /**
     * 箱唛号列表
     */
    @JsonProperty("carton_list")
    private List<CartonListItem> cartonList;


    /**
     * 商品信息变更列表
     */
    @JsonProperty("renewal_product_list")
    private List<CartonProductLineItem> renewalProductList;

}
