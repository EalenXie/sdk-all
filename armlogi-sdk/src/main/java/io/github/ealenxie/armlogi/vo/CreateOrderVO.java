package io.github.ealenxie.armlogi.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/23 11:18
 * @version 1.0
 */
@Getter
@Setter
public class CreateOrderVO {

    /**
     * orderCode
     */
    @JsonProperty("orderCode")
    private String orderCode;
}
