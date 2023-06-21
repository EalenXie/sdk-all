package io.github.ealenxie.eccang.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/12 16:35
 */
@Getter
@Setter
public class ProductBySkuDTO {

    private String productSku;
    private Integer getProductCombination;
    private Integer getProductCustomCategory;

}
