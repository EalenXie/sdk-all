package io.github.ealenxie.alyunwms.dto.inventory;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/2/13 14:05
 **/
@Getter
@Setter
public class QueryInventoryDTO {

    /**
     * 每页数据长度
     */
    @JsonProperty("pageSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize = 100;
    /**
     * 当前页
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer page;
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productSku;
    /**
     * 多个SKU
     */
    @JsonProperty("product_sku_arr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> productSkuArr;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 多个仓库代
     */
    @JsonProperty("warehouse_code_arr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> warehouseCodeArr;
    /**
     * 最新修改时间
     */
    @JsonProperty("update_start_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateStartTime;
    /**
     * 最后修改时间
     */
    @JsonProperty("update_end_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateEndTime;
    /**
     * 是否低于预警库存（0全部 1是 2否）
     */
    @JsonProperty("is_warning")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isWarning;
    /**
     * 产品名称
     */
    @JsonProperty("product_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productTitle;
    /**
     * 搜索类型（1精准，0模糊）默认精准查询，
     * 用于product_title、product_sku的查询
     */
    @JsonProperty("search_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String searchType;
}

