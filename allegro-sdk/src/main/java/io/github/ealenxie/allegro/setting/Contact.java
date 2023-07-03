package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 10:38
 * @version 1.0
 */
@Getter
@Setter
public class Contact {
    /**
     * phoneNumber
     */
    @JsonProperty("phoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNumber;
    /**
     * email
     */
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
}
