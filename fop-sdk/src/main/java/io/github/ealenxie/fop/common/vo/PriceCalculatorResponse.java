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
    @JsonProperty("service_code")
    private String serviceCode;
    @JsonProperty("product_code")
    private String productCode;
    @JsonProperty("quotation_code")
    private String quotationCode;
    @JsonProperty("total_amount")
    private Double totalAmount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("fees")
    private List<Fee> fees;
    @JsonProperty("timely")
    private String timely;
}
