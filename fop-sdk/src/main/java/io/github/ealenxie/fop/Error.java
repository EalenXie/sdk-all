package io.github.ealenxie.fop;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 4px错误返回信息
 */

@Setter
@Getter
public class Error {
    /**
     * 错误代码
     */
    @JsonProperty("error_code")
    private String errorCode;
    /**
     * 错误信息
     */
    @JsonProperty("error_msg")
    private String errorMsg;
    /**
     *
     */
    @JsonProperty("error_data")
    private String errorData;
    @JsonProperty("referenceCode")
    private String referenceCode;
}
