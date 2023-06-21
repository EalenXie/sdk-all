package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SubProductInfo {

    /**
     * 子产品名称
     */
    @JsonProperty("sku")
    private String sku;

    /**
     * 子产品数量
     */
    @JsonProperty("qty")
    private String qty;

}
