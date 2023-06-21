package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/1/20 12:38
 * 万邑通对接配置属性
 */
@Getter
@Setter
public class WinitConfig {

    /**
     * 登录万邑联的账号
     */
    @JsonProperty("app_key")
    private String appKey;
    /**
     * 应用ID client_id获取方法，请参照<a href="https://developer.winit.com.cn/document/detail/id/127.html">《开发者控制台 操作手册》</a>
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 应用密钥 参照<a href="https://developer.winit.com.cn/document/detail/id/127.html">《开发者控制台 操作手册》</a>
     */
    @JsonProperty("client_secret")
    private String clientSecret;
    /**
     * 账号信息 参考<a href="https://developer.winit.com.cn/document/detail/id/1.html">新手接入指南</a>
     */
    @JsonProperty("token")
    private String token;
    /**
     * 应用Code
     * 获取方法，请参照<a href="https://developer.winit.com.cn/document/detail/id/127.html">《开发者控制台 操作手册》</a>
     */
    @JsonProperty("platform")
    private String platform;

}
