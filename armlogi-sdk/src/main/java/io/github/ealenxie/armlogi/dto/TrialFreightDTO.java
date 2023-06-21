package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/23 13:47
 * @version 1.0
 */
@Getter
@Setter
public class TrialFreightDTO {

    /**
     * 目的地国家简码
     */
    @JsonProperty("countryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String countryCode;
    /**
     * 服务类型[0:出库服务,1:调拨服务]
     */
    @JsonProperty("serviceType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serviceType;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 邮编
     */
    @JsonProperty("zipCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String zipCode;
    /**
     * 物流产品code
     */
    @JsonProperty("shipCodes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> shipCodes;
    /**
     * 产品信息
     */
    @JsonProperty("products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Product> products;
}
