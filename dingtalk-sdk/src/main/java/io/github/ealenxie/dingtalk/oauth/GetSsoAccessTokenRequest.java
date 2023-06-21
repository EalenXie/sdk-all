package io.github.ealenxie.dingtalk.oauth;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/4/27 16:09
 **/
@Getter
@Setter
public class GetSsoAccessTokenRequest {

    /**
     * 企业的corpId。
     */
    private String corpid;
    /**
     * sso密钥，可以在开发者后台基本信息—开发信息（旧版）页面查看。
     */
    private String ssoSecret;
}

