package io.github.ealenxie.manomano.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/16 8:53
 */
@Setter
@Getter
public class OrderDTO extends ManoManoDTO {
    /**
     * 订单号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("order_ref")
    private String orderRef;

    public OrderDTO(String login, String password, String method) {
        super(login, password, method);
    }
}
