package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 14 05
 */
@Getter
@Setter
public class UploadRefundVoucher {
    /**
     * 图片域名
     */
    @JsonProperty("imageDomain")
    private String imageDomain;
    /**
     * 图片相对路径
     */
    @JsonProperty("imageRelativeUrl")
    private String imageRelativeUrl;
}
