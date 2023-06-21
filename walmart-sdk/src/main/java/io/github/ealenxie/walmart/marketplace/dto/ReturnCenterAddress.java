package io.github.ealenxie.walmart.marketplace.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/24 10:33
 */
@Getter
@Setter
public class ReturnCenterAddress {
    /**
     * name
     */
    private String name;
    /**
     * address1
     */
    private String address1;
    /**
     * city
     */
    private String city;
    /**
     * state
     */
    private String state;
    /**
     * postalCode
     */
    private String postalCode;
    /**
     * country
     */
    private String country;
    /**
     * dayPhone
     */
    private String dayPhone;
    /**
     * emailId
     */
    private String emailId;
}
