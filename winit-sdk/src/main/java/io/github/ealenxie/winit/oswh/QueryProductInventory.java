package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 13:32
 * @version 1.0
 */
@Getter
@Setter
public class QueryProductInventory {
    /**
     * DOI层级： 1：30以下 2：30-60 3：60-90 4：90以上
     */
    @JsonProperty("DOITier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String doiTier;
    /**
     * 库存类型：Country：国家，Warehouse：仓库
     */
    @JsonProperty("inventoryType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String inventoryType;
    /**
     * 商品是否有效,Y/N
     */
    @JsonProperty("isActive")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isActive;
    /**
     * 页码
     */
    @JsonProperty("pageNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageNum = 1;
    /**
     * 每页显示数量
     */
    @JsonProperty("pageSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize = 100;
    /**
     * 商品编码
     */
    @JsonProperty("productCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productCode;
    /**
     * 商品名称
     */
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    /**
     * 仓库ID
     */
    @JsonProperty("warehouseId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseId;
    /**
     * 仓库Code
     */
    @JsonProperty("warehouseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 库存变更开始时间(开始和结束时间跨度不能超过24小时),格式 yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("startTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String startTime;
    /**
     * 库存变更结束时间(开始和结束时间跨度不能超过24小时),格式 yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("startTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String endTime;
}
