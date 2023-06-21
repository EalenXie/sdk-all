package io.github.ealenxie.cne.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * Created by EalenXie on 2022/9/16 9:58
 */
@Getter
@Setter
@NoArgsConstructor
public class CneCommon {

    @JsonProperty("RequestName")
    private String requestName;
    @JsonProperty("icID")
    private String icID;
    @JsonProperty("TimeStamp")
    private String timeStamp;
    @JsonProperty("MD5")
    private String md5;


    public CneCommon(String requestName, String icID, String clientSecret) {
        this.requestName = requestName;
        this.icID = icID;
        long timestamp = System.currentTimeMillis();
        this.timeStamp = String.valueOf(timestamp);
        this.md5 = getMD5(icID, timestamp, clientSecret);
    }

    /**
     * @param clientId     客户端Id(icID)
     * @param clientSecret 客户端秘钥(也就是apiToken)
     * @param timeStamp    时间戳
     */
    public static String getMD5(String clientId, Long timeStamp, String clientSecret) {
        // 获取认证信息，密码加密MD5
        String md5String = clientId + timeStamp + clientSecret;
        return DigestUtils.md5DigestAsHex(md5String.getBytes(StandardCharsets.UTF_8));
    }
}
