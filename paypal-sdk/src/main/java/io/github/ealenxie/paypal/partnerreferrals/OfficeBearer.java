package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class OfficeBearer {
    /**
     * names
     */
    @JsonProperty("names")
    private List<NamePayload> names;
    /**
     * citizenship
     */
    @JsonProperty("citizenship")
    private String citizenship;
    /**
     * addresses
     */
    @JsonProperty("addresses")
    private List<AddressPayload> addresses;
    /**
     * phones
     */
    @JsonProperty("phones")
    private List<PhonePayload> phones;
    /**
     * birthDetails
     */
    @JsonProperty("birth_details")
    private BirthDetail birthDetails;
    /**
     * role
     */
    @JsonProperty("role")
    private String role;
}
