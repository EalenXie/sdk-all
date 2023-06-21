package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月27日 0027 09 39
 */
@Getter
@Setter
public class InventoryLog {
    /**
     * 客户代码
     */
    @JsonProperty("customer_code")
    private String customerCode;
    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * 入库委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
    /**
     * 批次号
     */
    @JsonProperty("batch_no")
    private String batchNo;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 创建时间-开始。*注：最大支持一个月（30天）数据进行查询。时间格式：传入时间值需要转换为long类型格式。
     */
    @JsonProperty("create_time_start")
    private Long createTimeStart;
    /**
     * 创建时间-结束。*注：最大支持一个月（30天）数据进行查询。时间格式：传入时间值需要转换为long类型格式。
     */
    @JsonProperty("create_time_end")
    private Long createTimeEnd;
    /**
     * 页码
     */
    @JsonProperty("page_no")
    private Integer pageNo;
    /**
     * 每页记录数
     */
    @JsonProperty("page_size")
    private Integer pageSize;
}
