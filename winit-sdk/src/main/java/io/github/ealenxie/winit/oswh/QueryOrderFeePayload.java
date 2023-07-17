package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.winit.PageParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 13:16
 * @version 1.0
 */
@Getter
@Setter
public class QueryOrderFeePayload {

    /**
     * 海外仓出库单号
     */
    @JsonProperty("businessDocumentNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String businessDocumentNo;
    /**
     * 卖家订单号
     */
    @JsonProperty("sellerNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerNo;
    /**
     * 跟踪号/快递单号
     */
    @JsonProperty("trackingNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingNo;
    /**
     * 出库海外仓编码
     */
    @JsonProperty("destinationWarehouse")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String destinationWarehouse;
    /**
     * 下单起始日期(精确至日) 2019-08-01
     */
    @JsonProperty("orderDateFrom")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderDateFrom;
    /**
     * 下单截止日期(精确至日) 2019-08-26
     */
    @JsonProperty("orderDateTo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderDateTo;
    /**
     * 分页参数
     */
    @JsonProperty("pageParams")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageParams pageParams;
}
