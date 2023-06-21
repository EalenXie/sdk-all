package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * 获取定制应用的accessToken 请求参数
 *
 * @author lanzhi
 * Created on 2023/4/27 13:51
 **/
@Getter
@Setter
public class GetCorpAccessTokenRequest {
    /**
     * 授权企业的CorpId。
     */
    private String authCorpId;
    /**
     * 定制应用的CustomKey。
     */
    private String suiteKey;
    /**
     * 定制应用的CustomSecret。
     */
    private String suiteSecret;
    /**
     * 钉钉推送的suiteTicket，定制应用该参数自定义，比如Test。
     */
    private String suiteTicket;
}

