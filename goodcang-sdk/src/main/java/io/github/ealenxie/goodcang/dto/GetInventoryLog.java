package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetInventoryLog {


    @JsonProperty("application_code")
    private String applicationCode;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("product_sku_list")
    private List<String> productSkuList;
    @JsonProperty("reference_no_list")
    private List<String> referenceNoList;
    @JsonProperty("create_date_from")
    private String createDateFrom;
    @JsonProperty("create_date_end")
    private String createDateEnd;
    @JsonProperty("pageSize")
    private String pageSize;
    @JsonProperty("page")
    private String page;
}
