package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/31 16:13
 **/
@Getter
@Setter
public class PaymentMethodMetaData {
    /**
     * bankCountryCode
     */
    private String bankCountryCode;
    /**
     * bankAccountName
     */
    private String bankAccountName;
    /**
     * bankAccountIBAN
     */
    private String bankAccountIBAN;
    /**
     * bankBIC
     */
    private String bankBIC;
}

