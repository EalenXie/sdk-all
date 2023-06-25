package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 16:09
 */
@Getter
@Setter
public class ProductFreezeListPayload {

    /**
     * 冻结状态
     */
    @JsonProperty("freeze_status")
    private Integer freezeStatus;
    /**
     * 商品sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 商品sku列表
     */
    @JsonProperty("product_sku_list")
    private List<String> productSkuList;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code_list")
    private List<String> warehouseCodeList;
    /**
     * 仓库代码
     */
    @JsonProperty("time_type")
    private Integer timeType;
    /**
     * 起始时间
     */
    @JsonProperty("start_time")
    private String startTime;
    /**
     * 结束时间
     */
    @JsonProperty("end_time")
    private String endTime;
    /**
     * 分页数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;
    /**
     * 分页页码
     */
    @JsonProperty("page")
    private Integer page;
}
