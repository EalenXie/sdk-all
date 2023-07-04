package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 14:53
 * @version 1.0
 */
@Getter
@Setter
public class QueryInventoryStatement {
    /**
     * 商品编码
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 订单类型
     * 入库：INBOUND
     * 出库：OUTBOUND
     * 调整：ADJUSTMENT
     * 调拨出库：ALLOCATION_OUT
     * 调拨入库：ALLOCATION_IN
     * 退货入库：INBOUND_RETURN
     * 直发入库：INBOUND_OVERSEAS
     */
    @JsonProperty("docType")
    private String docType;
    /**
     * 起始日期，格式 yyyy-MM-dd
     */
    @JsonProperty("startDate")
    private String startDate;
    /**
     * 截止日期，格式 yyyy-MM-dd
     */
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("pageVo")
    private PagePayload pageVo;
}
