package io.github.ealenxie.aliyun.ocr.vo.invoice.verify;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 17:25
 */
@Getter
@Setter
public class VerifyVATInvoice {

    /**
     * 状态码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 发票信息（只有查验成功，此字段才不为空）
     */
    @JsonProperty("data")
    private VATInvoice data;
    /**
     * 状态信息
     */
    @JsonProperty("msg")
    private String msg;
}
