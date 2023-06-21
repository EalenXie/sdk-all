package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/1/20 10:47
 */
@Getter
@Setter
public class WinitRequest<T> {

    /**
     * 方法名/接口英文名
     */
    @JsonProperty("action")
    private String action;
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
     * 客户签名
     * 签名生成方法，请参照：<a href="https://developer.winit.com.cn/document/detail/id/6.html">《签名认证》</a>中sign的生成
     */
    @JsonProperty("client_sign")
    private String clientSign;
    /**
     * 业务参数
     */
    @JsonProperty("data")
    private T data;
    /**
     * 格式
     */
    @JsonProperty("format")
    private String format = "json";
    /**
     * 语言
     */
    @JsonProperty("language")
    private String language = "zh_CN";
    /**
     * 应用Code
     * 获取方法，请参照<a href="https://developer.winit.com.cn/document/detail/id/127.html">《开发者控制台 操作手册》</a>
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 应用签名
     * 签名生成方法，请参照：<a href="https://developer.winit.com.cn/document/detail/id/6.html">《签名认证》</a>中client_sign的生成
     */
    @JsonProperty("sign")
    private String sign;
    /**
     * 签名方式
     */
    @JsonProperty("sign_method")
    private String signMethod = "md5";
    /**
     * 时间戳 格式为 yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("timestamp")
    private String timestamp;
    /**
     * 版本/接口版本
     */
    @JsonProperty("version")
    private String version = "1.0";

    public WinitRequest(String action, String appKey, String clientId, String platform) {
        this.action = action;
        this.appKey = appKey;
        this.clientId = clientId;
        this.platform = platform;
    }
}
