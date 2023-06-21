package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 产品信息参数
 *
 * @author zhs
 * @since 2022-12-16
 */
@Setter
@Getter
public class GetProductInfo {

    /**
     * 1688商品ID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("productId")
    private Long productId;

}
