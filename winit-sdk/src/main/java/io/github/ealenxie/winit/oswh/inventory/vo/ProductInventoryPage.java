package io.github.ealenxie.winit.oswh.inventory.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 13:46
 * @version 1.0
 */
@Getter
@Setter
public class ProductInventoryPage {
    /**
     * 页码
     */
    @JsonProperty("StartRow")
    private Integer startRow;
    /**
     * 每页条数
     */
    @JsonProperty("NumRows")
    private Integer numRows;
    /**
     * 总条数
     */
    @JsonProperty("TotalRows")
    private Integer totalRows;
}
