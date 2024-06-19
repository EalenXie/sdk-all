package io.github.ealenxie.dingtalk.addressbook;


import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/15 14:15
 **/
@Getter
@Setter
public class UserResponse {
    /**
     * 头像地址
     */
    private String avatarUrl;
    /**
     * 用户的个人邮箱
     */
    private String email;
    /**
     * 用户的手机号
     */
    private String mobile;
    /**
     * 用户的钉钉昵称
     */
    private String nick;
    /**
     * 用户的openId
     */
    private String openId;
    /**
     * 手机号对应的国家号
     */
    private String stateCode;
    /**
     * 用户的unionId
     */
    private String unionId;
}

