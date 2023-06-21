package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:04
 */
@Getter
@Setter
public class MemberRegister {
    @JsonProperty("buyerId")
    private String buyerId;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("country")
    private String country;
}
