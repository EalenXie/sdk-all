package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月23日 0023 15 19
 */
@Getter
@Setter
public class TakeStockForLocationDTO {

    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;

    /**
     * 产品明细
     */
    @JsonProperty("productList")
    private List<TakeStockForLocationProductDTO> productList;

    /**
     * 操作人
     */
    @JsonProperty("userCode")
    private String userCode;

}
