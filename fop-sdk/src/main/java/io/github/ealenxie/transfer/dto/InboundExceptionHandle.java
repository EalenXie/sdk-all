package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 20:09
 */
@Getter
@Setter
public class InboundExceptionHandle {
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("serialNo")
    private String serialNo;
    @JsonProperty("exceptionHandle")
    private ExceptionHandle exceptionHandle;
    @JsonProperty("productList")
    private List<ExceptionProduct> productList;
    @JsonProperty("returnException")
    private ReturnInboundExp returnException;
}
