package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询库存（库位维度显示）请求参数
 *
 * @author zhs
 * @since 2022年12月23日 0023 13 58
 */
@Getter
@Setter
public class GetProductInventoryForLocationDTO {

    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 上架时间
     */
    @JsonProperty("putTimeFrom")
    private String putTimeFrom;
    /**
     * 上架时间
     */
    @JsonProperty("putTimeEnd")
    private String putTimeEnd;
    /**
     * 分区类型：1拣货区,2存储区，3缺货区
     */
    @JsonProperty("areaType")
    private String areaType;
    /**
     * SKU
     */
    @JsonProperty("productSku")
    private String productSku;
    /**
     * 页码
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页条数，最大1000
     */
    @JsonProperty("pageSize")
    private Integer pageSize;

}
