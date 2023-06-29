package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class InsuranceInfo {
    /**
     * 保险类型（XY:4PX保价；XP:第三方保险）
     * <p>
     * 5Y, 5元每票
     * <p>
     * 8Y, 8元每票
     * <p>
     * 6P, 0.6%保费
     */
    @JsonProperty("insure_type")
    private String insureType;

    /**
     * 保险价值
     */
    @JsonProperty("insure_value")
    private Integer insureValue;

    /**
     * 保险币别（按照ISO标准，目前只支持USD）
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 投保人/公司
     */
    @JsonProperty("insure_person")
    private String insurePerson;

    /**
     * 投保人证件类型（暂时只支持身份证，类型为：ID）
     */
    @JsonProperty("certificate_type")
    private String certificateType;

    /**
     * 投保人证件号码
     */
    @JsonProperty("certificate_no")
    private String certificateNo;

    /**
     * 保险类目ID（保险的类目，暂时不填，默认取第一个类目）
     */
    @JsonProperty("category_code")
    private String categoryCode;

    /**
     * 投保货物名称
     */
    @JsonProperty("insure_product_name")
    private String insureProductName;

    /**
     * 投保包装及数量
     */
    @JsonProperty("package_qty")
    private String packageQty;
}
