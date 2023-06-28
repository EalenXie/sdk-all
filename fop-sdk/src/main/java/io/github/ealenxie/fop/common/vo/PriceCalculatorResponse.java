package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 0:04
 */
@Getter
@Setter
public class PriceCalculatorResponse {
    /**
     * 服务类别
     */
    @JsonProperty("service_code")
    private String serviceCode;

    /**
     * 业务产品
     */
    @JsonProperty("product_code")
    private String productCode;

    /**
     * 报价编码
     */
    @JsonProperty("quotation_code")
    private String quotationCode;

    /**
     * 总金额
     */
    @JsonProperty("total_amount")
    private Double totalAmount;

    /**
     * 币种（汇总币种）
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 各项费用计费列表
     */
    @JsonProperty("fees")
    private List<Fee> fees;

    /**
     * 时效描述
     */
    @JsonProperty("timely")
    private String timely;
}
