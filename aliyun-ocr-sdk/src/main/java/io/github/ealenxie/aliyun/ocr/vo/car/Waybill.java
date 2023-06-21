package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/6 16:39
 */
@Getter
@Setter
public class Waybill {

    /**
     * 收件人姓名
     */
    @JsonProperty("recipientName")
    private String recipientName;
    /**
     * 收件人电话
     */
    @JsonProperty("recipientPhoneNumber")
    private String recipientPhoneNumber;
    /**
     * 收件人地址
     */
    @JsonProperty("recipientAddress")
    private String recipientAddress;
    /**
     * 寄件人姓名
     */
    @JsonProperty("senderName")
    private String senderName;
    /**
     * 寄件人电话
     */
    @JsonProperty("senderPhoneNumber")
    private String senderPhoneNumber;
    /**
     * 寄件人地址
     */
    @JsonProperty("senderAddress")
    private String senderAddress;
}
