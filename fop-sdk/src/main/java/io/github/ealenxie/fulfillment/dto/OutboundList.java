package io.github.ealenxie.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * fop获取订单请求实体
 */
@Getter
@Setter
public class OutboundList {

    /**
     * 客户参考号。如：REF234234223
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ref_no")
    private String refNo;
    /**
     * 出库委托单号。如：OC9002781804180098
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("consignment_no")
    private String consignmentNo;
    /**
     * 4PX跟踪号。4PX唯一跟踪号。可用于在4PX轨迹系统查询。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("4px_tracking_no")
    private String trackingNo;
    /**
     * 出库委托状态。可选值：N（草稿）；S（出库中）；P（已下架）；C（已出库）；X（已取消）；D（已删除）；E（异常）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("status")
    private String status;
    /**
     * 异常子状态： G（欠费）；B（计费异常）；R（审核失败）；S（缺货）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sub_status")
    private String subStatus;
    /**
     * 换号状态：Y（异常）；N（正常）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tracking_status")
    private String trackingStatus;
    /**
     * SKU编码(4px的sku)
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * 发货仓库代码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("from_warehouse_code")
    private String fromWarehouseCode;
    /**
     * 物流产品代码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    /**
     * 卖家ID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("seller_id")
    private String sellerId;
    /**
     * 销售平台,可选值：AE(速卖通);WS(Wish);EB(eBay);AM(亚马逊);TM(天猫国际);JD(京东)
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sales_platform")
    private String salesPlatform;
    /**
     * 销售/平台交易号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sales_no")
    private String salesNo;
    /**
     * 物流单号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("shipping_no")
    private String shippingNo;
    /**
     * 出库退件标识。可选值：N（未退件）;R1（服务商退件）;R2（GRS退件）;R9（GRS取消退件）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("return_flag")
    private String returnFlag;
    /**
     * 国家
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("country")
    private String country;
    /**
     * 创建时间-开始 ,时间默认为当天。  *注：最大支持一个月（30天）数据进行查询，时间格式：传入时间值需要转换为long类型格式
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("create_time_start")
    private Long createTimeStart;
    /**
     * 创建时间-结束  ,时间默认为当天。 *注：最大支持一个月（30天）数据进行查询，时间格式：传入时间值需要转换为long类型格式
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("create_time_end")
    private Long createTimeEnd;
    /**
     * 发货时间-开始 ,时间默认为当天。  *注：最大支持一个月（30天）数据进行查询，时间格式：传入时间值需要转换为long类型格式
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("complete_time_start")
    private Long completeTimeStart;
    /**
     * 发货时间-结束 ,时间默认为当天。  *注：最大支持一个月（30天）数据进行查询，时间格式：传入时间值需要转换为long类型格式
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("complete_time_end")
    private Long completeTimeEnd;
    /**
     * 页码。默认为第1页
     */
    @JsonProperty("page_no")
    private Integer pageNo = 1;
    /**
     * 每页记录数。默认记录数为：50。*注：单次查询最大支持500条
     */
    @JsonProperty("page_size")
    private Integer pageSize = 50;
    /**
     * 客户操作账号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("customer_code")
    private String customerCode;

}
