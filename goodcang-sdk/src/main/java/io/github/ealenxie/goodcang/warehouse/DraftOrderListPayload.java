package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.Pagination;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 14:04
 */
@Getter
@Setter
public class DraftOrderListPayload extends Pagination {
    /**
     * 订单状态
     * C:待发货审核
     * H:暂存
     */
    @JsonProperty("order_status")
    private String orderStatus;

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

}
