package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.alyunwms.vo.Error;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * @author create by sch  2023/2/23 13:12
 * @version 1.0
 */
@Getter
@Setter
public class AsnResponse<T> {
    @JsonProperty("ask")
    private String ask;
    @JsonProperty("f_ask")
    private String fAsk;
    @JsonProperty("message")
    private String message;
    @JsonProperty("receiving_code")
    private String receivingCode;
    @JsonProperty("data")
    private T data;
    @JsonProperty("Error")
    private Error error;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("Success", ask);
    }
}
