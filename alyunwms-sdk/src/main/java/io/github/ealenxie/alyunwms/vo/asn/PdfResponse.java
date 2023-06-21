package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.alyunwms.vo.Error;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * @author create by sch  2023/2/24 16:18
 * @version 1.0
 */
@Getter
@Setter
public class PdfResponse {

    @JsonProperty("ask")
    private String ask;
    @JsonProperty("message")
    private String message;
    /**
     * 入参pdf_type
     */
    @JsonProperty("type")
    private String type;
    /**
     * base64编码或url
     */
    @JsonProperty("base64")
    private String baseOrUrl;
    /**
     * 可选值为 true、false，当 base64 字段为 url 时，content_is_url 为 true，否则为 false
     */
    @JsonProperty("content_is_url")
    private Boolean contentIsUrl;
    @JsonProperty("Error")
    private Error error;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("Success", ask);
    }
}
