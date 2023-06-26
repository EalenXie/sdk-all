package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/22 11:08
 */

@Getter
@Setter
public class OrderListPayload {


    /**
     * 每页数据长度，最大值100
     * Required
     */
    @JsonProperty("pageSize")
    private Integer pageSize;

    /**
     * 当前页
     * Required
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 50
     * Optional
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;

    /**
     * 订单号字符串数组
     */
    @JsonProperty("order_code_arr")
    private List<String> orderCodeArr;

    /**
     * 物流产品代码
     * Optional
     */
    @JsonProperty("shipping_method")
    private String shippingMethod;

    /**
     * datetime
     * 订单创建开始时间
     */
    @JsonProperty("create_date_from")
    private String createDateFrom;

    /**
     * datetime
     * 订单创建结束时间
     */
    @JsonProperty("create_date_to")
    private String createDateTo;

    /**
     * datetime
     * 订单修改开始时间
     */
    @JsonProperty("modify_date_from")
    private String modifyDateFrom;

    /**
     * datetime
     * 订单修改结束时间
     */
    @JsonProperty("modify_date_to")
    private String modifyDateTo;

    /**
     * datetime
     * 订单出库开始时间
     */
    @JsonProperty("date_shipping_from")
    private String dateShippingFrom;

    /**
     * datetime
     * 订单出库结束时间
     */
    @JsonProperty("date_shipping_to")
    private String dateShippingTo;

    /**
     * 订单状态
     * W:待发货
     * D:已发货
     * N:异常订单
     * P:问题件
     * X:废弃
     */
    @JsonProperty("order_status")
    private String orderStatus;


}
