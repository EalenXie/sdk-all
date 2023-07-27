package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/27 14:39
 **/
@Getter
@Setter
public class Recipient {

    /**
     * The prefix, or title, to the party's name.
     */
    @JsonProperty("prefix")
    private String prefix;
    /**
     * When the party is a person, the party's given, or first, name.
     */
    @JsonProperty("given_name")
    private String givenName;
    /**
     * When the party is a person, the party's surname or family name.
     * Also known as the last name.
     * Required when the party is a person.
     * Use also to store multiple surnames including the matronymic, or mother's, surname.
     */
    @JsonProperty("surname")
    private String surname;

    /**
     * When the party is a person, the party's middle name.
     * Use also to store multiple middle names including the patronymic, or father's, middle name.
     */
    @JsonProperty("middle_name")
    private String middleName;
    /**
     * The suffix for the party's name.
     */
    @JsonProperty("suffix")
    private String suffix;
    /**
     * The party's alternate name.
     * Can be a business name, nickname, or any other name that cannot be split into first, last name.
     * Required when the party is a business.
     */
    @JsonProperty("alternate_full_name")
    private String alternateFullName;
    /**
     * When the party is a person, the party's full name.
     */
    @JsonProperty("full_name")
    private String fullName;
}

