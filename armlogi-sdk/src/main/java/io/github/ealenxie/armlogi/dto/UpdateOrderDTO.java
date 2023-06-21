package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/23 14:11
 * @version 1.0
 */
@Getter
@Setter
public class UpdateOrderDTO extends CreateOrderDTO {

    /**
     * 订单Code
     */
    @JsonProperty("orderCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderCode;
}
