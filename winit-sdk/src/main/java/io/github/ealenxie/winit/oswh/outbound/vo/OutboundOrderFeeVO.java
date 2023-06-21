package io.github.ealenxie.winit.oswh.outbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 13:23
 * @version 1.0
 */
@Getter
@Setter
public class OutboundOrderFeeVO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("orgId")
    private String orgId;
    @JsonProperty("isDelete")
    private String isDelete;
    /**
     * 是否生效
     */
    @JsonProperty("isActive")
    private String isActive;
    /**
     * 交易时间（精确至秒）
     */
    @JsonProperty("created")
    private String created;
    @JsonProperty("createdby")
    private String createdby;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("updatedby")
    private String updatedby;
    /**
     * 出库订单号
     */
    @JsonProperty("businessDocumentNo")
    private String businessDocumentNo;
    /**
     * 下单时间
     */
    @JsonProperty("orderDate")
    private String orderDate;
    /**
     * 出库海外仓
     */
    @JsonProperty("destinationWarehouse")
    private String destinationWarehouse;
    /**
     * 卖家订单号
     */
    @JsonProperty("sellerNo")
    private String sellerNo;
    /**
     * 跟踪号/快递单号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * 尾程派送方式代码
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * 尾程派送方式名称
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * 费用明细
     */
    @JsonProperty("incomeSettlementLineVos")
    private List<IncomeSettlementLineVos> incomeSettlementLineVos;
}
