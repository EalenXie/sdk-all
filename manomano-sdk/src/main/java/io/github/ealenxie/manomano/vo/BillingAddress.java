package io.github.ealenxie.manomano.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/8/16 9:45
 */
@Getter
@Setter
public class BillingAddress {
    /**
     * 名
     */
    @JsonProperty("lastname")
    private String lastname;
    /**
     * 姓
     */
    @JsonProperty("firstname")
    private String firstname;
    /**
     * 公司
     */
    @JsonProperty("company")
    private String company;
    @JsonProperty("address_1")
    private String address1;
    @JsonProperty("address_2")
    private String address2;
    @JsonProperty("address_3")
    private String address3;
    /**
     * 邮政编码
     */
    @JsonProperty("zipcode")
    private String zipcode;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 国家
     */
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_iso")
    private String countryIso;
    /**
     * 电话
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    @JsonProperty("is_professional")
    private String isProfessional;
    /**
     * 收件人
     */
    @JsonProperty("codice_destinatario")
    private String codiceDestinatario;
}
