package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * 应用管理后台免登的用户信息
 *
 * @author lanzhi
 * Created on 2023/4/27 11:28
 **/
@Getter
@Setter
public class GetSsoUserInfoResponseBody {

    /**
     * 微应用免登用户所在企业的corpId。
     */
    private String corpId;
    /**
     * 微应用免登用户所在企业名称
     */
    private String corpName;
    /**
     * 用户userid。
     */
    private String userId;
    /**
     * 用户名称。
     */
    private String userName;
    /**
     * 用户邮箱。
     */
    private String email;
    /**
     * 用户头像链接。
     */
    private String avatar;
    /**
     * 是否为企业管理员。
     */
    private Boolean isAdmin;
}

