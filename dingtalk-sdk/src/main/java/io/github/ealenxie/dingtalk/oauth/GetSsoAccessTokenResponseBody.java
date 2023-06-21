package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * 获取微应用后台免登的access_token的响应参数
 *
 * @author lanzhi
 * Created on 2023/4/27 16:12
 **/
@Getter
@Setter
public class GetSsoAccessTokenResponseBody {
    /**
     * 生成的accessToken。
     */
    private String accessToken;
    /**
     * accessToken的过期时间，单位秒
     */
    private Long expireIn;
}

