package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:07
 */
@Getter
@Setter
public class UnauthorizedConfirmPayload {

    /**
     * 售后码
     */
    @JsonProperty("pas_code")
    private String pasCode;
    /**
     * 处理方式
     */
    @JsonProperty("exception_process_type")
    private Integer exceptionProcessType;
    /**
     * 新商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
}
