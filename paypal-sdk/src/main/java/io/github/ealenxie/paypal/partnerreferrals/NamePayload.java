package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class NamePayload {
    /**
     * prefix
     */
    @JsonProperty("prefix")
    private String prefix;
    /**
     * givenName
     */
    @JsonProperty("given_name")
    private String givenName;
    /**
     * surname
     */
    @JsonProperty("surname")
    private String surname;
    /**
     * middleName
     */
    @JsonProperty("middle_name")
    private String middleName;
    /**
     * suffix
     */
    @JsonProperty("suffix")
    private String suffix;
    /**
     * fullName
     */
    @JsonProperty("full_name")
    private String fullName;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
