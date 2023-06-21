package io.github.ealenxie.alyunwms.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/1/29 11:12
 * @version 1.0
 */
@Getter
@Setter
public class QueryProductDTO {
    @JsonProperty("pageSize")
    private Integer pageSize = 100;
    @JsonProperty("page")
    private Integer page = 1;
    @JsonProperty("product_sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productSku;
    @JsonProperty("product_sku_arr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> productSkuArr;
    @JsonProperty("start_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String startTime;
    @JsonProperty("end_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String endTime;
    @JsonProperty("update_start_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updateStartTime;
    @JsonProperty("update_end_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updateEndTime;
}
