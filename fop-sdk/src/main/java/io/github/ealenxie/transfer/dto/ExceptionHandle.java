package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:09
 */
@Getter
@Setter
public class ExceptionHandle {
    @JsonProperty("exceptionHandleCode")
    private String exceptionHandleCode;
    @JsonProperty("exceptionHandleDesc")
    private String exceptionHandleDesc;
}
