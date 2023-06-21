package io.github.ealenxie;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/8/23 11:33
 * 4PX 公共请求参数
 */
@Getter
@Setter
public class CommonArgs extends AppKeySecret {

    /**
     * API接口名称
     */
    private String method;

    /**
     * 时间戳
     */
    private Long timestamp;

    /**
     * API协议版本，参考接口版本号
     */
    @JsonProperty("v")
    private String version = "1.0.0";

    /**
     * 提交的业务数据。默认为json格式，可选值：json。
     */
    private String format = "json";
    /**
     * 响应信息的语言，支持cn（中文），en（英文）
     */
    private String language = "cn";


    public CommonArgs(String appKey, String appSecret, String method) {
        this(appKey, appSecret, null, method);
    }

    public CommonArgs(AppKeySecret appKeySecret, String method) {
        this(appKeySecret.getAppKey(), appKeySecret.getAppSecret(), appKeySecret.getAccessToken(), method);
    }


    public CommonArgs(String appKey, String appSecret, String accessToken, String method) {
        super(appKey, appSecret, accessToken);
        this.method = method;
        this.timestamp = System.currentTimeMillis();
    }

}
