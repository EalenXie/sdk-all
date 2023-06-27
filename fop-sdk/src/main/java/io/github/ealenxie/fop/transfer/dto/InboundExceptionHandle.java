package io.github.ealenxie.fop.transfer.dto;

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
    /**
     * 4PX单号(入库异常的4px单号)
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 请求流水号
     */
    @JsonProperty("serialNo")
    private String serialNo;

    /**
     * 异常解决方案
     */
    @JsonProperty("exceptionHandle")
    private ExceptionHandle exceptionHandle;

    /**
     * 商品列表
     */
    @JsonProperty("productList")
    private List<ExceptionProduct> productList;

    /**
     * 退件信息
     * <p>
     * 只有处理异常处理方案编码exceptionHandleCode为: RETURN；TRANS_RETURN
     * <p>
     * 则需要填写此对象信息
     */
    @JsonProperty("returnException")
    private ReturnInboundExp returnException;
}
