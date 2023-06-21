package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 37
 */
@Getter
@Setter
public class OrderEntryCount {

    /**
     * 子订单id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("id")
    private Long id;
    /**
     * 子订单购买商品数量
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("count")
    private Integer count;

}
