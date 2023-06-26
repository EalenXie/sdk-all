package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VatChangeInfo {
    /**
     * IOSS号码
     */
    @JsonProperty("ioss_number")
    private String iossNumber;
    /**
     * PID号码
     */
    @JsonProperty("pid_number")
    private String pidNumber;
    /**
     * 收件人EORI
     */
    @JsonProperty("recipient_eori")
    private String recipientEori;
    /**
     * 收件人VAT
     */
    @JsonProperty("recipient_vat")
    private String recipientVat;
    /**
     * 发件人EORI
     */
    @JsonProperty("shipper_eori")
    private String shipperEori;
    /**
     * 发件人VAT
     */
    @JsonProperty("shipper_vat")
    private String shipperVat;

    /**
     * 收件人VAT注册国
     */
    @JsonProperty("recipient_vat_country")
    private String recipientVatCountry;

    /**
     * 收件人EORI号注册国
     */
    @JsonProperty("recipient_eori_country")
    private String recipientEoriCountry;
    /**
     * 发件人公司名称
     */
    @JsonProperty("shipper_company_name")
    private String shipperCompanyName;
}