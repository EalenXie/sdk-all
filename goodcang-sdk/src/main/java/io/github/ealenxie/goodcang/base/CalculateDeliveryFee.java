package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 13:17
 */
@Getter
@Setter
public class CalculateDeliveryFee {
    /**
     * 物流产品代码
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 物流产品的英文名称
     */
    @JsonProperty("sm_name")
    private String smName;
    /**
     * 物流产品的中文名称
     */
    @JsonProperty("sm_name_cn")
    private String smNameCn;
    /**
     * 最慢时效
     */
    @JsonProperty("sm_delivery_time_min")
    private Integer smDeliveryTimeMin;
    /**
     * 最快时效
     */
    @JsonProperty("sm_delivery_time_max")
    private Integer smDeliveryTimeMax;
    /**
     * 总费用
     */
    @JsonProperty("total")
    private BigDecimal total;
    /**
     * 明细
     */
    @JsonProperty("income")
    private List<Income> income;
}
