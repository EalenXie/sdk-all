package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 10:16
 */
@Getter
@Setter
public class UserVO {
    /**
     * 用户ID
     */
    @JsonProperty("user_id")
    private Integer userId;
    /**
     * 登录名称
     */
    @JsonProperty("user_code")
    private String userCode;
    /**
     * 中文名
     */
    @JsonProperty("user_name")
    private String useName;
    /**
     * 英文名
     */
    @JsonProperty("user_name_en")
    private String userNameEn;
}
