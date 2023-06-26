package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetInventoryLogPayload extends PagePayload {
    /**
     * 操作类型
     */
    @JsonProperty("application_code")
    private String applicationCode;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 商品编码
     */

    @JsonProperty("product_sku_list")
    private List<String> productSkuList;
    /**
     * 操作单号
     */

    @JsonProperty("reference_no_list")
    private List<String> referenceNoList;
    /**
     * 开始时间
     */
    @JsonProperty("create_date_from")
    private String createDateFrom;
    /**
     * 结束时间
     */
    @JsonProperty("create_date_end")
    private String createDateEnd;
}
