package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月27日 0027 10 30
 */
@Getter
@Setter
public class InboundList {
    /**
     * 入库委托单号 。如：IC9002781804101123
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 入库委托参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 仓库代码（详细参考公共服务，获取仓库代码）
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 入库委托创建开始时间（*注：时间格式：传入时间值需要转换为long类型格式。）。最大支持3个月数据查询。
     */
    @JsonProperty("create_time_start")
    private Long createTimeStart;

    /**
     * 入库委托创建结束时间（*注：时间格式：传入时间值需要转换为long类型格式。）。最大支持3个月数据查询。
     */
    @JsonProperty("create_time_end")
    private Long createTimeEnd;

    /**
     * 物流产品代码。详细参考基础数据-获取物流产品代码。
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;

    /**
     * 入库委托状态。可选值：N（草稿）;S（待审批）;A（已审批）;B（预约中）;F（预约确认）;R（预约拒绝）;G（收货中）;V（已收货）;K（已查验）;H（已出库）;P（上架中）;C（已上架）;E（异常）;X（已取消）;D（已删除）
     */
    @JsonProperty("status")
    private String status;

    /**
     * 页码。默认为第1页。如：1。
     */
    @JsonProperty("page_no")
    private Number pageNo;

    /**
     * 每页记录数。默认记录数为：20。如：10。*注：单次查询最大支持100条，可小于100进行查询。
     */
    @JsonProperty("page_size")
    private Number pageSize;

    /**
     * 客户操作帐号。如果客户存在操作账号，则可以指定客户操作账号进行查询，如果不传入，则查询返回所有操作账号下入库委托信息。
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * 4PX跟踪号；入库委托创建成功后返回。4PX唯一单号；可跟进跟踪号在4PX轨迹系统查询轨迹信息。如：9082324423
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
}
