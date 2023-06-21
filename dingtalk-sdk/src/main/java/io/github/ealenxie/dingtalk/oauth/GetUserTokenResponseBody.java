package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * 获取用户token响应
 *
 * @author lanzhi
 * Created on 2023/4/27 10:34
 **/
@Getter
@Setter
public class GetUserTokenResponseBody {

    /**
     * 生成的accessToken。
     */
    private String accessToken;
    /**
     * 生成的refresh_token。可以使用此刷新token，定期的获取用户的accessToken
     */
    private String corpId;
    /**
     * 超时时间，单位秒
     */
    private Long expireIn;
    /**
     * 所选企业corpId。
     */
    private String refreshToken;
}

