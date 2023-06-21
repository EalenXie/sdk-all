package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * 企业内部应用的accessToken 请求参数
 *
 * @author lanzhi
 * Created on 2023/4/27 13:36
 **/
@Getter
@Setter
public class GetAccessTokenRequest {
    /**
     * 已创建的企业内部应用的AppKey
     */
    private String appKey;
    /**
     * 已创建的企业内部应用的AppSecret。
     */
    private String appSecret;
}

