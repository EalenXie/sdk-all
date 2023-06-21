package io.github.ealenxie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/28 13:55
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppKeySecret {

    /**
     * 应用接入申请的AppKey
     */
    @JsonProperty("app_key")
    private String appKey;

    /**
     * 签名密钥 ,用作于签名认证
     */
    @JsonIgnore
    private String appSecret;

    /**
     * 通过OAuth授权方式获得，要求平台服务商、第三方软件商必须传入，4PX客户（B类客户）可不传
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("access_token")
    private String accessToken;

    public AppKeySecret(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

}
