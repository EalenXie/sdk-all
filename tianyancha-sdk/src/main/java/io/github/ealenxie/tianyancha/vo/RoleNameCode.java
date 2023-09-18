package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/18 16:16
 */
@Getter
@Setter
public class RoleNameCode {
    /**
     * 角色
     */
    @JsonProperty("role")
    private String role;

    /**
     * 脱敏证件号
     */
    @JsonProperty("code")
    private String code;

    /**
     * 法人姓名
     */
    @JsonProperty("name")
    private String name;
}
