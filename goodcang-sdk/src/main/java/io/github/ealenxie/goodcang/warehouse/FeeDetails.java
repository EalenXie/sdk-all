package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 订单费用对象
 *
 * @author zhs
 */
@Getter
@Setter
public class FeeDetails {
    /**
     * 总费用
     */
    @JsonProperty("totalFee")
    private Double totalFee;
    /**
     * 运输费
     */
    @JsonProperty("SHIPPING")
    private Double shipping;
    /**
     * 操作费用
     */
    @JsonProperty("OPF")
    private Double opf;
    /**
     * 燃油附加费
     */
    @JsonProperty("FSC")
    private Double fsc;
    /**
     * 关税
     */
    @JsonProperty("DT")
    private Double dt;

    /**
     * 挂号
     */
    @JsonProperty("RSF")
    private Double rsf;

    /**
     * 其它费用
     */
    @JsonProperty("OTF")
    private Double otf;

    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;

}