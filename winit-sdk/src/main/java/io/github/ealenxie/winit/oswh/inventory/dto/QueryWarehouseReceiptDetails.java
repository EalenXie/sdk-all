package io.github.ealenxie.winit.oswh.inventory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 14:08
 * @version 1.0
 */
@Getter
@Setter
public class QueryWarehouseReceiptDetails extends PageDTO {
    /**
     * 商品编码
     */
    @JsonProperty("merchandiseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseCode;
    /**
     * 商品条码
     */
    @JsonProperty("merchandiseBarcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String merchandiseBarcode;
    /**
     * 海外仓储收费单号
     */
    @JsonProperty("WarehousereceiptNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String wareHouseReceiptNum;
    /**
     * 海外仓编码
     */
    @JsonProperty("warehouseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 仓租开始日期 格式：YYYY-MM-DD
     */
    @JsonProperty("startTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String startTime;
    /**
     * 仓租结束日期 格式：YYYY-MM-DD
     */
    @JsonProperty("endTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String endTime;
}
