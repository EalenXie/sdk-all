package io.github.ealenxie.paypal.identity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 小小怪下士
 * @version 1.0.0
 */
@Getter
@Setter
public class UserInfo {
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("sub")
    private String sub;
    @JsonProperty("name")
    private String name;
    @JsonProperty("given_name")
    private String givenName;
    @JsonProperty("family_name")
    private String familyName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("payer_id")
    private String payerId;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("verified_account")
    private String verifiedAccount;
    @JsonProperty("emails")
    private List<Email> emails;
}
