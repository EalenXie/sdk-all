package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PaymentDetails {

    /**
     * 信用卡
     **/
    @JsonProperty("credit_card_bin")
    private String creditCardBin;
    /**
     * avs结果代码
     **/
    @JsonProperty("avs_result_code")
    private String avsResultCode;
    /**
     * cvv结果代码
     **/
    @JsonProperty("cvv_result_code")
    private String cvvResultCode;
    /**
     * 信用卡号
     **/
    @JsonProperty("credit_card_number")
    private String creditCardNumber;
    /**
     * 信用卡公司
     **/
    @JsonProperty("credit_card_company")
    private String creditCardCompany;

}
