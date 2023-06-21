package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * 企业内部应用的accessToken 响应参数
 *
 * @author lanzhi
 * Created on 2023/4/27 13:38
 **/
@Getter
@Setter
public class GetAccessTokenResponseBody {
    /**
     * 生成的accessToken。
     */
    private String accessToken;
    /**
     * accessToken的过期时间，单位秒
     */
    private Long expireIn;
}

