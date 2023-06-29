package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:07
 */
@Getter
@Setter
public class DeclareCountryPayload {
    /**
     * 申报产品品牌
     */
    @JsonProperty("brand")
    private String brand;
    /**
     * 申报产品清关资料URL。
     * <p>
     * 上传文件资料限定格式，文件格式可选值：rar、zip、Excel(xls和xlsx）、word文档(doc和docx)、pdf。
     */
    @JsonProperty("certificate_url")
    private String certificateUrl;
    /**
     * 申报币别(采用国际ISO标准)
     * <p>
     * 可选值：USD(美元);CNY(人民币)。如：USD
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 清关国家(国家二字码
     * <p>
     * 详细参考国际二字码。如：CN（中国）
     */
    @JsonProperty("declare_country")
    private String declareCountry;
    /**
     * 清关类型
     * <p>
     * 可选值：I(进口)
     */
    @JsonProperty("declare_type")
    private String declareType;
    /**
     * 申报产品单价，精确到2位小数。
     * <p>
     * 如：12341.33
     */
    @JsonProperty("declare_unit_price")
    private Double declareUnitPrice;
    /**
     * 申报产品清关资料URL集合
     * <p>
     * 证书资料支持多个
     */
    @JsonProperty("certificate_list")
    private List<Certificate> certificateList;
}
