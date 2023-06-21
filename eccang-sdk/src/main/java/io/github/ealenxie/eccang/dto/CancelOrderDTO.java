package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月26日 0026 11 26
 */
@Getter
@Setter
public class CancelOrderDTO {
    /**
     * 销售单号，创建订单返回
     */
    @JsonProperty("saleOrderCode")
    private String saleOrderCode;

    /**
     * 订单新状态，只能是 0 和 7 两个值，0：已废弃（默认值），7：问题件
     */
    @JsonProperty("targetStatus")
    private Integer targetStatus;

}
