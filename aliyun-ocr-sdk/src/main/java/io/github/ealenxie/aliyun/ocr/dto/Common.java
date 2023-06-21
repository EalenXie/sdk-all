package io.github.ealenxie.aliyun.ocr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by EalenXie on 2023/3/23 12:43
 * 公共参数
 */
@Getter
@Setter
public class Common {

    private static final DateTimeFormatter DEFAULT_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssz");
    private static final DateTimeFormatter DATETIMEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.of("UTC"));
    /**
     * API的名称
     */
    @JsonProperty("Action")
    private String action;
    /**
     * 访问密钥ID
     */
    @JsonProperty("AccessKeyId")
    private String accessKeyId;
    /**
     * SignatureMethod
     */
    @JsonProperty("SignatureMethod")
    private String signatureMethod = "HMAC-SHA1";
    /**
     * SignatureVersion
     */
    @JsonProperty("SignatureVersion")
    private String signatureVersion = "1.0";
    /**
     * 签名随机字符串
     */
    @JsonProperty("SignatureNonce")
    private String signatureNonce;
    /**
     * 时间戳
     */
    @JsonProperty("Timestamp")
    private String timestamp;
    /**
     * API版本号，格式为YYYY-MM-DD。取值：2021-07-07
     */
    @JsonProperty("Version")
    private String version = "2021-07-07";
    /**
     * 返回参数的语言类型。取值范围 JSON/ XML 默认JSON
     */
    @JsonProperty("Format")
    private String format = "JSON";


    /**
     * @param accessKeyId accessKeyId
     * @param action      action 参数
     */
    public Common(String accessKeyId, String action) {
        this.action = action;
        this.accessKeyId = accessKeyId;
        this.signatureNonce = String.valueOf(System.currentTimeMillis());
        this.timestamp = ZonedDateTime.parse(DATETIMEFORMATTER.format(new Date().toInstant()), DATETIMEFORMATTER).withFixedOffsetZone().format(DEFAULT_DATE_FORMATTER);
    }

}
