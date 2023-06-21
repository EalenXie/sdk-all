package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 11:08
 */
@Getter
@Setter
public class OrderIdListDTO {
    /**
     * 订单Id列表,最多批量30个订单，订单过多会导致超时，建议一次10个订单
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderIdList")
    private List<Long> orderIdList;
}
