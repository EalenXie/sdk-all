package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 预估运费请求实体
 *
 * @author create by sch  2023/4/20 16:40
 * @version 1.0
 */
@Getter
@Setter
public class CalcDeliveryFeePayload {

    /**
     * 目的地国家
     */
    @JsonProperty("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String country;
    /**
     * 目的地州
     */
    @JsonProperty("region")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String region;
    /**
     * 目的地城市
     */
    @JsonProperty("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String city;
    /**
     * 商品销售总金额
     */
    @JsonProperty("salesAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String salesAmount;
    /**
     * 销售金额币种
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currency;
    /**
     * IOSS
     */
    @JsonProperty("iossNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String iossNo;
    /**
     * 卖家VAT
     */
    @JsonProperty("VATNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String vATNo;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 派送方式代码
     */
    @JsonProperty("winitProductCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String winitProductCode;
    /**
     * 邮编
     */
    @JsonProperty("zipCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String zipCode;
    /**
     * 商品列表
     */
    @JsonProperty("productList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<OutboundProductPayload> productList;
}
