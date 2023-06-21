package io.github.ealenxie.common.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 4px渠道实体
 */
@Setter
@Getter
public class LogisticsProduct {
    /**
     * 物流产品代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    /**
     * 物流产品中文名称
     */
    @JsonProperty("logistics_product_name_cn")
    private String logisticsProductNameCn;
    /**
     * 物流产品英文名称
     */
    @JsonProperty("logistics_product_name_en")
    private String logisticsProductNameEn;
}
