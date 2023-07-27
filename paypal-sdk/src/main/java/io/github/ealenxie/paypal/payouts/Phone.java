package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/26 16:42
 **/
@Getter
@Setter
public class Phone {
    /**
     *  The country calling code (CC), in its canonical international E.164 numbering plan format.
     *  The combined length of the CC and the national number must not be greater than 15 digits.
     *  The national number consists of a national destination code (NDC) and subscriber number (SN).
     */
    @JsonProperty("country_code")
    private String countryCode;

    /**
     *  The national number, in its canonical international E.164 numbering plan format.
     *  The combined length of the country calling code (CC) and the national number must not be greater than 15 digits.
     *  The national number consists of a national destination code (NDC) and subscriber number (SN).
     */
    @JsonProperty("national_number")
    private String nationalNumber;


    /**
     *  The extension number.
     */
    @JsonProperty("extension_number")
    private String extensionNumber;

}

