package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/20 16:30
 * @version 1.0
 */
@Getter
@Setter
public class OrderLabelPayload {
    /**
     * 运单号
     * 上传装箱清单且订单存在多个运单时，需填写多条label数据
     */
    @JsonProperty("orderNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderNo;
    /**
     * 上传面单时，必填跟踪号
     */
    @JsonProperty("trackingNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingNo;
    /**
     * 只允许填写为pdf
     */
    @JsonProperty("format")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String format;
    /**
     * PDF文件转成64Base流
     */
    @JsonProperty("labelFileContent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String labelFileContent;
    /**
     * 枚举值包括：
     * shiplabel：上传面单
     * packlist：上传装箱清单
     */
    @JsonProperty("fileType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fileType;
}
