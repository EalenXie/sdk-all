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
    /**
     * 买家ID
     */
    @JsonProperty("buyerId")
    private String buyerId;

    /**
     * 会员邮箱(买家)
     */
    @JsonProperty("mail")
    private String mail;

    /**
     * 会员电话(买家)
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 会员所属国家二字码(买家)
     */
    @JsonProperty("country")
    private String country;
}
