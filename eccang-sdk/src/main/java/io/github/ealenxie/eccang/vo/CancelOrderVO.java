package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月26日 0026 11 29
 */
@Getter
@Setter
public class CancelOrderVO {
    /**
     * 订单号
     */
    @JsonProperty("saleOrderCode")
    private String saleOrderCode;

    /**
     * 订单状态，0:已废弃,1:付款未完成,2:待发货审核,3:待发货,4:已发货,5:冻结中,6:缺货,7:问题件,8:未付款
     */
    @JsonProperty("status")
    private Integer status;

}
