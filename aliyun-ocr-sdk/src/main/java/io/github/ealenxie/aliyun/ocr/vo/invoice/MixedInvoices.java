package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/4 13:22
 */
@Getter
@Setter
public class MixedInvoices {

    /**
     * 发票信息（subMsgs字段）
     */
    @JsonProperty("subMsgs")
    private List<SubMsg> subMsgs;
    /**
     * 识别的图片个数
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * 算法矫正图片后的高度
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * 原图的高度
     */
    @JsonProperty("orgHeight")
    private Integer orgHeight;
    /**
     * 原图的宽度
     */
    @JsonProperty("orgWidth")
    private Integer orgWidth;

    /**
     * 算法矫正图片后的宽度
     */
    @JsonProperty("width")
    private Integer width;

    @JsonProperty("ftype")
    private Integer ftype;

}
