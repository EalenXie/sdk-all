package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class DeclareCountryPayload {
    /**
     * 清关国家。国家二字码，详细参考国际二字码。
     * <p>
     * 如：CN（中国）
     */
    @JsonProperty("declare_country")
    private String declareCountry;

    /**
     * 清关类型。
     * <p>
     * 如：I(进口)
     */
    @JsonProperty("declare_type")
    private String declareType;

    /**
     * 申报产品单价，精确到2位小数。
     * <p>
     * 如：12341.34
     */
    @JsonProperty("declare_unit_price")
    private String declareUnitPrice;

    /**
     * 申报币别。采用国际ISO标准。
     * <p>
     * 如：USD(美元);CNY(人民币)。
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 国家申报状态。
     * <p>
     * 如：N（草稿）；S（已提交）；C（已通过）；E（异常）
     */
    @JsonProperty("declare_country_status")
    private String declareCountryStatus;

    /**
     * 海关编码
     */
    @JsonProperty("hs_code")
    private String hsCode;

    /**
     * 数量1
     */
    @JsonProperty("qty1")
    private Integer qty1;

    /**
     * 数量2
     */
    @JsonProperty("qty2")
    private Integer qty2;

    /**
     * 单位1
     */
    @JsonProperty("unit1")
    private String unit1;

    /**
     * 单位2
     */
    @JsonProperty("unit2")
    private String unit2;

    /**
     * 供应商代码
     */
    @JsonProperty("supplier_code")
    private String supplierCode;

    /**
     * 申报产品清关资料URL集合。证书资料支持多个
     */
    @JsonProperty("certificate_list")
    private List<Certificate> certificates;
}
