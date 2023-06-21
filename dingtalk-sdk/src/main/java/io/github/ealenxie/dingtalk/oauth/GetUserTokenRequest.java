package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * 获取用户token参数
 *
 * @author lanzhi
 * Created on 2023/4/27 10:02
 **/
@Getter
@Setter
public class GetUserTokenRequest {
    /**
     * 应用id。可使用扫码登录应用或者第三方个人小程序的appId。
     * 企业内部应用传应用的AppKey
     * 第三方企业应用传应用的SuiteKey
     * 第三方个人应用传应用的AppId
     */
    private String clientId;
    /**
     * 应用密钥。
     * 企业内部应用传应用的AppSecret
     * 第三方企业应用传应用的SuiteSecret
     * 第三方个人应用传应用的AppSecret
     */
    private String clientSecret;
    /**
     * OAuth 2.0 临时授权码
     */
    private String code;
    /**
     * 如果使用授权码换token，传 authorization_code。
     * 如果使用刷新token换用户token，传 refresh_token。
     */
    private String grantType;
    /**
     * OAuth2.0刷新令牌，从返回结果里面获取。
     */
    private String refreshToken;
}

