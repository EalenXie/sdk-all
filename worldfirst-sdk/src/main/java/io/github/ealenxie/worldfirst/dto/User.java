package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/8/1 14:16
 **/
@Getter
@Setter
public class User {
    /**
     * 用户ID，指在万里汇注册的用户ID
     * 字段最大长度：32
     */
    private String userId;
    /**
     * 用户名
     * 字段最大长度：128
     */
    private UserName userName;
    /**
     * 用户登录账号
     * 字段最大长度：128
     */
    private String logonId;
    /**
     * 用户子账号昵称
     */
    private UserName userNickname;
    /**
     * 用户地址
     * 字段最大长度：512
     */
    private Address userAddress;
    /**
     * 用户邮箱
     * 字段最大长度：67
     */
    private String userEmail;
    /**
     * 用户电话号码
     * 字段最大长度：32
     */
    private String userMobile;

}

